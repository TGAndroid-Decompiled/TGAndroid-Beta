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
public final class mq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public cc0 G;
    public lq0 H;
    public final kq0[] f28483a;
    public int f28484b;
    public int f28485c;
    public long d;
    public ArrayList f28486e;
    public final ArrayList f28487f;
    public boolean h;
    public boolean f28488n;
    public String f28489r;
    public final ArrayList f28490s;
    public final HashMap v;
    public TLRPC.WebPage f28491w;
    public int f28492x;
    public int f28493y;

    public mq0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f28483a = new kq0[2];
        this.f28484b = 0;
        this.f28487f = new ArrayList();
        this.f28488n = true;
        this.f28490s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            kq0[] kq0VarArr = this.f28483a;
            if (i10 < kq0VarArr.length) {
                kq0VarArr[i10] = new kq0(this, activity, f6Var);
                addView(this.f28483a[i10], w7.x5.c(-1.0f, -1));
                i10++;
            } else {
                kq0VarArr[0].setVisibility(0);
                this.f28483a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(kq0 kq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = kq0Var.f27888b;
        x9 x9Var = kq0Var.f27892n;
        imageView.setImageResource(R.drawable.msg_link2);
        kq0Var.f27888b.setVisibility(0);
        kq0Var.f27891f.setVisibility(8);
        kq0Var.f27893r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        kq0Var.f27889c.l(str2, false);
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
        kq0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                x9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                x9Var.setVisibility(0);
            } else {
                x9Var.setVisibility(8);
            }
        } else {
            x9Var.setVisibility(8);
        }
        kq0Var.f27887a.setClickable(false);
    }

    public static void b(x9 x9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            x9Var.setVisibility(8);
            return;
        }
        x9Var.setVisibility(0);
        x9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            x9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                x9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            x9Var.p(photoEntry.orientation, photoEntry.invert, true);
            x9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            x9Var.setImageDrawable(null);
        }
    }

    public final String c(kq0 kq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f28487f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                if (arrayList.size() == 1) {
                    shortName = DialogObject.getName(this.f28485c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f28485c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
        if (j5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = j5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && j5Var.getPaint().measureText(formatString) <= f7) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f28492x != 0) {
            AccountInstance.getInstance(this.f28485c).getConnectionsManager().cancelRequest(this.f28492x, true);
            this.f28492x = 0;
        }
        this.f28493y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f28491w != null && i11 == this.f28485c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f20022id == this.f28491w.f20022id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f28491w = null;
                        d();
                        if (this.f28484b != 0) {
                            this.f28484b = 0;
                            lq0 lq0Var = this.H;
                            if (lq0Var != null) {
                                ((org.telegram.ui.xv) lq0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f28491w = webPage;
                        ArrayList arrayList = this.f28490s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f28483a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mq0.e(java.lang.CharSequence, boolean):void");
    }

    public final x9 f(int i10) {
        x9[] x9VarArr;
        if (this.f28484b == 1 && (x9VarArr = this.f28483a[0].h) != null && i10 >= 0 && i10 < x9VarArr.length && x9VarArr[i10].getVisibility() == 0) {
            return x9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f28486e = null;
        this.h = true;
        this.f28488n = true;
        this.f28489r = null;
        this.f28491w = null;
        d();
        this.f28490s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f28491w;
    }

    public int getMode() {
        return this.f28484b;
    }

    public final void h(int i10) {
        if (this.f28485c == i10) {
            this.f28485c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f28485c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f28485c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f28485c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f28485c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        lq0 lq0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f28486e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f28491w = null;
        d();
        this.f28490s.clear();
        int i12 = this.f28484b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28484b = 1;
        if (z10) {
            k();
        }
        kq0[] kq0VarArr = this.f28483a;
        kq0 kq0Var = kq0VarArr[0];
        ImageView imageView = kq0Var.f27888b;
        org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
        x9[] x9VarArr = kq0Var.h;
        org.telegram.ui.ActionBar.j5 j5Var2 = kq0Var.f27889c;
        imageView.setImageResource(R.drawable.filled_forward);
        kq0Var.f27888b.setVisibility(0);
        kq0Var.f27892n.setVisibility(8);
        kq0Var.f27891f.setVisibility(0);
        kq0Var.f27893r.setVisibility(8);
        kq0Var.f27887a.setClickable(true);
        ArrayList arrayList2 = this.f28486e;
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
                j5Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                j5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                j5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                j5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            j5Var.l(c(kq0Var), false);
            x9 x9Var = x9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(x9Var, photoEntry);
            x9 x9Var2 = x9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(x9Var2, photoEntry2);
            x9 x9Var3 = x9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(x9Var3, photoEntry3);
        } else {
            j5Var2.l("", false);
            j5Var.l("", false);
            for (x9 x9Var4 : x9VarArr) {
                x9Var4.setVisibility(8);
            }
        }
        kq0 kq0Var2 = kq0VarArr[0];
        String str = this.F;
        if (str != null) {
            kq0Var2.f27890e.l(str, false);
        }
        int i16 = this.f28484b;
        if (i12 != i16 && (lq0Var = this.H) != null) {
            ((org.telegram.ui.xv) lq0Var).h(i16);
        }
    }

    public final void j() {
        kq0[] kq0VarArr;
        cc0 cc0Var = this.G;
        if (cc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
            this.G = null;
        }
        this.E = false;
        for (kq0 kq0Var : this.f28483a) {
            org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            kq0Var.f27890e.setAlpha(0.0f);
        }
    }

    public final void k() {
        kq0[] kq0VarArr = this.f28483a;
        kq0 kq0Var = kq0VarArr[0];
        kq0 kq0Var2 = kq0VarArr[1];
        kq0VarArr[0] = kq0Var2;
        kq0VarArr[1] = kq0Var;
        kq0Var2.getClass();
        kq0VarArr[0].setVisibility(0);
        kq0VarArr[0].setScaleX(0.8f);
        kq0VarArr[0].setScaleY(0.8f);
        kq0VarArr[0].setAlpha(0.0f);
        kq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = kq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        org.telegram.messenger.vl.q(translationY, prVar, 320L);
        kq0 kq0Var3 = kq0VarArr[1];
        kq0Var3.getClass();
        kq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new jq0(kq0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f28485c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28485c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (kq0 kq0Var : this.f28483a) {
            kq0Var.f27887a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(lq0 lq0Var) {
        this.H = lq0Var;
    }
}
