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
public final class nq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public bc0 G;
    public mq0 H;
    public final lq0[] f26514a;
    public int f26515b;
    public int f26516c;
    public long d;
    public ArrayList e;
    public final ArrayList f26517f;
    public boolean h;
    public boolean f26518n;
    public String f26519r;
    public final ArrayList f26520s;
    public final HashMap v;
    public TLRPC.WebPage f26521w;
    public int f26522x;
    public int f26523y;

    public nq0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f26514a = new lq0[2];
        this.f26515b = 0;
        this.f26517f = new ArrayList();
        this.f26518n = true;
        this.f26520s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            lq0[] lq0VarArr = this.f26514a;
            if (i10 < lq0VarArr.length) {
                lq0VarArr[i10] = new lq0(this, activity, f6Var);
                addView(this.f26514a[i10], w7.x5.c(-1.0f, -1));
                i10++;
            } else {
                lq0VarArr[0].setVisibility(0);
                this.f26514a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(lq0 lq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = lq0Var.f25959b;
        u9 u9Var = lq0Var.f25962n;
        imageView.setImageResource(R.drawable.msg_link2);
        lq0Var.f25959b.setVisibility(0);
        lq0Var.f25961f.setVisibility(8);
        lq0Var.f25963r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        lq0Var.f25960c.l(str2, false);
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
        lq0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                u9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                u9Var.setVisibility(0);
            } else {
                u9Var.setVisibility(8);
            }
        } else {
            u9Var.setVisibility(8);
        }
        lq0Var.f25958a.setClickable(false);
    }

    public static void b(u9 u9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            u9Var.setVisibility(8);
            return;
        }
        u9Var.setVisibility(0);
        u9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            u9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                u9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            u9Var.p(photoEntry.orientation, photoEntry.invert, true);
            u9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            u9Var.setImageDrawable(null);
        }
    }

    public final String c(lq0 lq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f26517f;
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
                    shortName = DialogObject.getName(this.f26516c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f26516c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.k5 k5Var = lq0Var.d;
        if (k5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = k5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && k5Var.getPaint().measureText(formatString) <= f7) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f26522x != 0) {
            AccountInstance.getInstance(this.f26516c).getConnectionsManager().cancelRequest(this.f26522x, true);
            this.f26522x = 0;
        }
        this.f26523y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f26521w != null && i11 == this.f26516c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f18274id == this.f26521w.f18274id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f26521w = null;
                        d();
                        if (this.f26515b != 0) {
                            this.f26515b = 0;
                            mq0 mq0Var = this.H;
                            if (mq0Var != null) {
                                ((org.telegram.ui.yv) mq0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f26521w = webPage;
                        ArrayList arrayList = this.f26520s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f26514a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nq0.e(java.lang.CharSequence, boolean):void");
    }

    public final u9 f(int i10) {
        u9[] u9VarArr;
        if (this.f26515b == 1 && (u9VarArr = this.f26514a[0].h) != null && i10 >= 0 && i10 < u9VarArr.length && u9VarArr[i10].getVisibility() == 0) {
            return u9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f26518n = true;
        this.f26519r = null;
        this.f26521w = null;
        d();
        this.f26520s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f26521w;
    }

    public int getMode() {
        return this.f26515b;
    }

    public final void h(int i10) {
        if (this.f26516c == i10) {
            this.f26516c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f26516c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f26516c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f26516c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f26516c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        mq0 mq0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f26521w = null;
        d();
        this.f26520s.clear();
        int i12 = this.f26515b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26515b = 1;
        if (z10) {
            k();
        }
        lq0[] lq0VarArr = this.f26514a;
        lq0 lq0Var = lq0VarArr[0];
        ImageView imageView = lq0Var.f25959b;
        org.telegram.ui.ActionBar.k5 k5Var = lq0Var.d;
        u9[] u9VarArr = lq0Var.h;
        org.telegram.ui.ActionBar.k5 k5Var2 = lq0Var.f25960c;
        imageView.setImageResource(R.drawable.filled_forward);
        lq0Var.f25959b.setVisibility(0);
        lq0Var.f25962n.setVisibility(8);
        lq0Var.f25961f.setVisibility(0);
        lq0Var.f25963r.setVisibility(8);
        lq0Var.f25958a.setClickable(true);
        ArrayList arrayList2 = this.e;
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
                k5Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                k5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                k5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                k5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            k5Var.l(c(lq0Var), false);
            u9 u9Var = u9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(u9Var, photoEntry);
            u9 u9Var2 = u9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(u9Var2, photoEntry2);
            u9 u9Var3 = u9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(u9Var3, photoEntry3);
        } else {
            k5Var2.l("", false);
            k5Var.l("", false);
            for (u9 u9Var4 : u9VarArr) {
                u9Var4.setVisibility(8);
            }
        }
        lq0 lq0Var2 = lq0VarArr[0];
        String str = this.F;
        if (str != null) {
            lq0Var2.e.l(str, false);
        }
        int i16 = this.f26515b;
        if (i12 != i16 && (mq0Var = this.H) != null) {
            ((org.telegram.ui.yv) mq0Var).h(i16);
        }
    }

    public final void j() {
        lq0[] lq0VarArr;
        bc0 bc0Var = this.G;
        if (bc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bc0Var);
            this.G = null;
        }
        this.E = false;
        for (lq0 lq0Var : this.f26514a) {
            org.telegram.ui.ActionBar.k5 k5Var = lq0Var.d;
            k5Var.setAlpha(1.0f);
            k5Var.setScaleX(1.0f);
            k5Var.setScaleY(1.0f);
            lq0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        lq0[] lq0VarArr = this.f26514a;
        lq0 lq0Var = lq0VarArr[0];
        lq0 lq0Var2 = lq0VarArr[1];
        lq0VarArr[0] = lq0Var2;
        lq0VarArr[1] = lq0Var;
        lq0Var2.getClass();
        lq0VarArr[0].setVisibility(0);
        lq0VarArr[0].setScaleX(0.8f);
        lq0VarArr[0].setScaleY(0.8f);
        lq0VarArr[0].setAlpha(0.0f);
        lq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = lq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        qr qrVar = qr.h;
        org.telegram.messenger.wl.q(translationY, qrVar, 320L);
        lq0 lq0Var3 = lq0VarArr[1];
        lq0Var3.getClass();
        lq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(qrVar).setDuration(320L).withEndAction(new kq0(lq0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f26516c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f26516c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (lq0 lq0Var : this.f26514a) {
            lq0Var.f25958a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(mq0 mq0Var) {
        this.H = mq0Var;
    }
}
