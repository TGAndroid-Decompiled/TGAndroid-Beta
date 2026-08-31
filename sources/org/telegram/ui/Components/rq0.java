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
public final class rq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean B;
    public String C;
    public ec0 D;
    public qq0 E;
    public final pq0[] f30819a;
    public int f30820b;
    public int f30821c;
    public long d;
    public ArrayList f30822e;
    public final ArrayList f30823f;
    public boolean h;
    public boolean f30824n;
    public String f30825r;
    public final ArrayList f30826s;
    public final HashMap v;
    public TLRPC.WebPage f30827w;
    public int f30828x;
    public int f30829y;

    public rq0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f30819a = new pq0[2];
        this.f30820b = 0;
        this.f30823f = new ArrayList();
        this.f30824n = true;
        this.f30826s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            pq0[] pq0VarArr = this.f30819a;
            if (i10 < pq0VarArr.length) {
                pq0VarArr[i10] = new pq0(this, activity, g6Var);
                addView(this.f30819a[i10], k7.c6.c(-1.0f, -1));
                i10++;
            } else {
                pq0VarArr[0].setVisibility(0);
                this.f30819a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(pq0 pq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = pq0Var.f30176b;
        p9 p9Var = pq0Var.f30180n;
        imageView.setImageResource(R.drawable.msg_link2);
        pq0Var.f30176b.setVisibility(0);
        pq0Var.f30179f.setVisibility(8);
        pq0Var.f30181r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        pq0Var.f30177c.l(str2, false);
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
        pq0Var.d.l(str3, false);
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
        pq0Var.f30175a.setClickable(false);
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

    public final String c(pq0 pq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f30823f;
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
                    shortName = DialogObject.getName(this.f30821c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f30821c, longValue);
                }
                sb.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
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
        if (this.f30828x != 0) {
            AccountInstance.getInstance(this.f30821c).getConnectionsManager().cancelRequest(this.f30828x, true);
            this.f30828x = 0;
        }
        this.f30829y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f30827w != null && i11 == this.f30821c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f20996id == this.f30827w.f20996id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f30827w = null;
                        d();
                        if (this.f30820b != 0) {
                            this.f30820b = 0;
                            qq0 qq0Var = this.E;
                            if (qq0Var != null) {
                                ((org.telegram.ui.tv) qq0Var).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f30827w = webPage;
                        ArrayList arrayList = this.f30826s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f30819a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rq0.e(java.lang.CharSequence, boolean):void");
    }

    public final p9 f(int i10) {
        p9[] p9VarArr;
        if (this.f30820b == 1 && (p9VarArr = this.f30819a[0].h) != null && i10 >= 0 && i10 < p9VarArr.length && p9VarArr[i10].getVisibility() == 0) {
            return p9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f30822e = null;
        this.h = true;
        this.f30824n = true;
        this.f30825r = null;
        this.f30827w = null;
        d();
        this.f30826s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f30827w;
    }

    public int getMode() {
        return this.f30820b;
    }

    public final void h(int i10) {
        if (this.f30821c == i10) {
            this.f30821c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f30821c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30821c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f30821c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30821c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z4;
        qq0 qq0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f30822e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f30827w = null;
        d();
        this.f30826s.clear();
        int i12 = this.f30820b;
        if (i12 != 1 && i12 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f30820b = 1;
        if (z4) {
            k();
        }
        pq0[] pq0VarArr = this.f30819a;
        pq0 pq0Var = pq0VarArr[0];
        ImageView imageView = pq0Var.f30176b;
        org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
        p9[] p9VarArr = pq0Var.h;
        org.telegram.ui.ActionBar.l5 l5Var2 = pq0Var.f30177c;
        imageView.setImageResource(R.drawable.filled_forward);
        pq0Var.f30176b.setVisibility(0);
        pq0Var.f30180n.setVisibility(8);
        pq0Var.f30179f.setVisibility(0);
        pq0Var.f30181r.setVisibility(8);
        pq0Var.f30175a.setClickable(true);
        ArrayList arrayList2 = this.f30822e;
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
            l5Var.l(c(pq0Var), false);
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
        pq0 pq0Var2 = pq0VarArr[0];
        String str = this.C;
        if (str != null) {
            pq0Var2.f30178e.l(str, false);
        }
        int i16 = this.f30820b;
        if (i12 != i16 && (qq0Var = this.E) != null) {
            ((org.telegram.ui.tv) qq0Var).g(i16);
        }
    }

    public final void j() {
        pq0[] pq0VarArr;
        ec0 ec0Var = this.D;
        if (ec0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ec0Var);
            this.D = null;
        }
        this.B = false;
        for (pq0 pq0Var : this.f30819a) {
            org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
            l5Var.setAlpha(1.0f);
            l5Var.setScaleX(1.0f);
            l5Var.setScaleY(1.0f);
            pq0Var.f30178e.setAlpha(0.0f);
        }
    }

    public final void k() {
        pq0[] pq0VarArr = this.f30819a;
        pq0 pq0Var = pq0VarArr[0];
        pq0 pq0Var2 = pq0VarArr[1];
        pq0VarArr[0] = pq0Var2;
        pq0VarArr[1] = pq0Var;
        pq0Var2.getClass();
        pq0VarArr[0].setVisibility(0);
        pq0VarArr[0].setScaleX(0.8f);
        pq0VarArr[0].setScaleY(0.8f);
        pq0VarArr[0].setAlpha(0.0f);
        pq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = pq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        org.telegram.ui.b.p(translationY, prVar, 320L);
        pq0 pq0Var3 = pq0VarArr[1];
        pq0Var3.getClass();
        pq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new oq0(pq0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f30821c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f30821c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (pq0 pq0Var : this.f30819a) {
            pq0Var.f30175a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(qq0 qq0Var) {
        this.E = qq0Var;
    }
}
