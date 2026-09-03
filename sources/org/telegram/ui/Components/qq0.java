package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean B;
    public String C;
    public ec0 D;
    public pq0 E;
    public final oq0[] f30492a;
    public int f30493b;
    public int f30494c;
    public long d;
    public ArrayList f30495e;
    public final ArrayList f30496f;
    public boolean h;
    public boolean f30497n;
    public String f30498r;
    public final ArrayList f30499s;
    public final HashMap v;
    public TLRPC.WebPage f30500w;
    public int f30501x;
    public int f30502y;

    public qq0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f30492a = new oq0[2];
        this.f30493b = 0;
        this.f30496f = new ArrayList();
        this.f30497n = true;
        this.f30499s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            oq0[] oq0VarArr = this.f30492a;
            if (i10 < oq0VarArr.length) {
                oq0VarArr[i10] = new oq0(this, activity, g6Var);
                addView(this.f30492a[i10], k7.c6.c(-1.0f, -1));
                i10++;
            } else {
                oq0VarArr[0].setVisibility(0);
                this.f30492a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(oq0 oq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = oq0Var.f29865b;
        p9 p9Var = oq0Var.f29869n;
        imageView.setImageResource(R.drawable.msg_link2);
        oq0Var.f29865b.setVisibility(0);
        oq0Var.f29868f.setVisibility(8);
        oq0Var.f29870r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        oq0Var.f29866c.l(str2, false);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null) {
            String str4 = webPage.display_url;
            if (str4 != null) {
                str = str4;
            }
            str3 = str;
        }
        oq0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                p9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                p9Var.setVisibility(0);
            } else {
                p9Var.setVisibility(8);
            }
        } else {
            p9Var.setVisibility(8);
        }
        oq0Var.f29864a.setClickable(false);
    }

    public static void b(p9 p9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            p9Var.setVisibility(8);
            return;
        }
        p9Var.setVisibility(0);
        p9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            p9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            p9Var.p(photoEntry.orientation, photoEntry.invert, true);
            p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            p9Var.setImageDrawable(null);
        }
    }

    public final String c(oq0 oq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f30496f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == this.d) {
                sb.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                if (arrayList.size() == 1) {
                    shortName = DialogObject.getName(this.f30494c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f30494c, longValue);
                }
                sb.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        org.telegram.ui.ActionBar.l5 l5Var = oq0Var.d;
        if (l5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = l5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && l5Var.getPaint().measureText(formatString) <= f10) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f30501x != 0) {
            AccountInstance.getInstance(this.f30494c).getConnectionsManager().cancelRequest(this.f30501x, true);
            this.f30501x = 0;
        }
        this.f30502y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f30500w != null && i11 == this.f30494c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f20998id == this.f30500w.f20998id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f30500w = null;
                        d();
                        if (this.f30493b != 0) {
                            this.f30493b = 0;
                            pq0 pq0Var = this.E;
                            if (pq0Var != null) {
                                ((org.telegram.ui.tv) pq0Var).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f30500w = webPage;
                        ArrayList arrayList = this.f30499s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f30492a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qq0.e(java.lang.CharSequence, boolean):void");
    }

    public final p9 f(int i10) {
        p9[] p9VarArr;
        if (this.f30493b == 1 && (p9VarArr = this.f30492a[0].h) != null && i10 >= 0 && i10 < p9VarArr.length && p9VarArr[i10].getVisibility() == 0) {
            return p9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f30495e = null;
        this.h = true;
        this.f30497n = true;
        this.f30498r = null;
        this.f30500w = null;
        d();
        this.f30499s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f30500w;
    }

    public int getMode() {
        return this.f30493b;
    }

    public final void h(int i10) {
        if (this.f30494c == i10) {
            this.f30494c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f30494c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30494c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f30494c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30494c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z4;
        pq0 pq0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f30495e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f30500w = null;
        d();
        this.f30499s.clear();
        int i12 = this.f30493b;
        if (i12 != 1 && i12 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f30493b = 1;
        if (z4) {
            k();
        }
        oq0[] oq0VarArr = this.f30492a;
        oq0 oq0Var = oq0VarArr[0];
        ImageView imageView = oq0Var.f29865b;
        org.telegram.ui.ActionBar.l5 l5Var = oq0Var.d;
        p9[] p9VarArr = oq0Var.h;
        org.telegram.ui.ActionBar.l5 l5Var2 = oq0Var.f29866c;
        imageView.setImageResource(R.drawable.filled_forward);
        oq0Var.f29865b.setVisibility(0);
        oq0Var.f29869n.setVisibility(8);
        oq0Var.f29868f.setVisibility(0);
        oq0Var.f29870r.setVisibility(8);
        oq0Var.f29864a.setClickable(true);
        ArrayList arrayList2 = this.f30495e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList2.get(i15);
                i15++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i13++;
                } else {
                    i14++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((MediaController.PhotoEntry) arrayList2.get(0)).isVideo) {
                    i11 = R.string.ShareSendVideo;
                } else {
                    i11 = R.string.ShareSendPhoto;
                }
                l5Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                l5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                l5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                l5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            l5Var.l(c(oq0Var), false);
            p9 p9Var = p9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(p9Var, photoEntry);
            p9 p9Var2 = p9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(p9Var2, photoEntry2);
            p9 p9Var3 = p9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(p9Var3, photoEntry3);
        } else {
            l5Var2.l("", false);
            l5Var.l("", false);
            for (p9 p9Var4 : p9VarArr) {
                p9Var4.setVisibility(8);
            }
        }
        oq0 oq0Var2 = oq0VarArr[0];
        String str = this.C;
        if (str != null) {
            oq0Var2.f29867e.l(str, false);
        }
        int i16 = this.f30493b;
        if (i12 != i16 && (pq0Var = this.E) != null) {
            ((org.telegram.ui.tv) pq0Var).g(i16);
        }
    }

    public final void j() {
        oq0[] oq0VarArr;
        ec0 ec0Var = this.D;
        if (ec0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ec0Var);
            this.D = null;
        }
        this.B = false;
        for (oq0 oq0Var : this.f30492a) {
            org.telegram.ui.ActionBar.l5 l5Var = oq0Var.d;
            l5Var.setAlpha(1.0f);
            l5Var.setScaleX(1.0f);
            l5Var.setScaleY(1.0f);
            oq0Var.f29867e.setAlpha(0.0f);
        }
    }

    public final void k() {
        oq0[] oq0VarArr = this.f30492a;
        oq0 oq0Var = oq0VarArr[0];
        oq0 oq0Var2 = oq0VarArr[1];
        oq0VarArr[0] = oq0Var2;
        oq0VarArr[1] = oq0Var;
        oq0Var2.getClass();
        oq0VarArr[0].setVisibility(0);
        oq0VarArr[0].setScaleX(0.8f);
        oq0VarArr[0].setScaleY(0.8f);
        oq0VarArr[0].setAlpha(0.0f);
        oq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = oq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        org.telegram.ui.b.p(translationY, prVar, 320L);
        oq0 oq0Var3 = oq0VarArr[1];
        oq0Var3.getClass();
        oq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new nq0(oq0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f30494c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f30494c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (oq0 oq0Var : this.f30492a) {
            oq0Var.f29864a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(pq0 pq0Var) {
        this.E = pq0Var;
    }
}
