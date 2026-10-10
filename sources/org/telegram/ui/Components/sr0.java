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
public final class sr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public cd0 G;
    public rr0 H;
    public final qr0[] f30839a;
    public int f30840b;
    public int f30841c;
    public long d;
    public ArrayList f30842e;
    public final ArrayList f30843f;
    public boolean h;
    public boolean f30844n;
    public String f30845r;
    public final ArrayList f30846s;
    public final HashMap v;
    public TLRPC.WebPage f30847w;
    public int f30848x;
    public int f30849y;

    public sr0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f30839a = new qr0[2];
        this.f30840b = 0;
        this.f30843f = new ArrayList();
        this.f30844n = true;
        this.f30846s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            qr0[] qr0VarArr = this.f30839a;
            if (i10 < qr0VarArr.length) {
                qr0VarArr[i10] = new qr0(this, activity, e6Var);
                addView(this.f30839a[i10], w7.x5.d(-1.0f, -1));
                i10++;
            } else {
                qr0VarArr[0].setVisibility(0);
                this.f30839a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(qr0 qr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = qr0Var.f30278b;
        y9 y9Var = qr0Var.f30282n;
        imageView.setImageResource(R.drawable.msg_link2);
        qr0Var.f30278b.setVisibility(0);
        qr0Var.f30281f.setVisibility(8);
        qr0Var.f30283r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        qr0Var.f30279c.l(str2, false);
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
        qr0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                y9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                y9Var.setVisibility(0);
            } else {
                y9Var.setVisibility(8);
            }
        } else {
            y9Var.setVisibility(8);
        }
        qr0Var.f30277a.setClickable(false);
    }

    public static void b(y9 y9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            y9Var.setVisibility(8);
            return;
        }
        y9Var.setVisibility(0);
        y9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            y9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                y9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            y9Var.p(photoEntry.orientation, photoEntry.invert, true);
            y9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            y9Var.setImageDrawable(null);
        }
    }

    public final String c(qr0 qr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f30843f;
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
                    shortName = DialogObject.getName(this.f30841c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f30841c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = qr0Var.d;
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
        if (this.f30848x != 0) {
            AccountInstance.getInstance(this.f30841c).getConnectionsManager().cancelRequest(this.f30848x, true);
            this.f30848x = 0;
        }
        this.f30849y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f30847w != null && i11 == this.f30841c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f20195id == this.f30847w.f20195id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f30847w = null;
                        d();
                        if (this.f30840b != 0) {
                            this.f30840b = 0;
                            rr0 rr0Var = this.H;
                            if (rr0Var != null) {
                                ((org.telegram.ui.vv) rr0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f30847w = webPage;
                        ArrayList arrayList = this.f30846s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f30839a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sr0.e(java.lang.CharSequence, boolean):void");
    }

    public final y9 f(int i10) {
        y9[] y9VarArr;
        if (this.f30840b == 1 && (y9VarArr = this.f30839a[0].h) != null && i10 >= 0 && i10 < y9VarArr.length && y9VarArr[i10].getVisibility() == 0) {
            return y9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f30842e = null;
        this.h = true;
        this.f30844n = true;
        this.f30845r = null;
        this.f30847w = null;
        d();
        this.f30846s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f30847w;
    }

    public int getMode() {
        return this.f30840b;
    }

    public final void h(int i10) {
        if (this.f30841c == i10) {
            this.f30841c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f30841c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30841c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f30841c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30841c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        rr0 rr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f30842e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f30847w = null;
        d();
        this.f30846s.clear();
        int i12 = this.f30840b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30840b = 1;
        if (z10) {
            k();
        }
        qr0[] qr0VarArr = this.f30839a;
        qr0 qr0Var = qr0VarArr[0];
        ImageView imageView = qr0Var.f30278b;
        org.telegram.ui.ActionBar.j5 j5Var = qr0Var.d;
        y9[] y9VarArr = qr0Var.h;
        org.telegram.ui.ActionBar.j5 j5Var2 = qr0Var.f30279c;
        imageView.setImageResource(R.drawable.filled_forward);
        qr0Var.f30278b.setVisibility(0);
        qr0Var.f30282n.setVisibility(8);
        qr0Var.f30281f.setVisibility(0);
        qr0Var.f30283r.setVisibility(8);
        qr0Var.f30277a.setClickable(true);
        ArrayList arrayList2 = this.f30842e;
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
            j5Var.l(c(qr0Var), false);
            y9 y9Var = y9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(y9Var, photoEntry);
            y9 y9Var2 = y9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(y9Var2, photoEntry2);
            y9 y9Var3 = y9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(y9Var3, photoEntry3);
        } else {
            j5Var2.l("", false);
            j5Var.l("", false);
            for (y9 y9Var4 : y9VarArr) {
                y9Var4.setVisibility(8);
            }
        }
        qr0 qr0Var2 = qr0VarArr[0];
        String str = this.F;
        if (str != null) {
            qr0Var2.f30280e.l(str, false);
        }
        int i16 = this.f30840b;
        if (i12 != i16 && (rr0Var = this.H) != null) {
            ((org.telegram.ui.vv) rr0Var).h(i16);
        }
    }

    public final void j() {
        qr0[] qr0VarArr;
        cd0 cd0Var = this.G;
        if (cd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cd0Var);
            this.G = null;
        }
        this.E = false;
        for (qr0 qr0Var : this.f30839a) {
            org.telegram.ui.ActionBar.j5 j5Var = qr0Var.d;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            qr0Var.f30280e.setAlpha(0.0f);
        }
    }

    public final void k() {
        qr0[] qr0VarArr = this.f30839a;
        qr0 qr0Var = qr0VarArr[0];
        qr0 qr0Var2 = qr0VarArr[1];
        qr0VarArr[0] = qr0Var2;
        qr0VarArr[1] = qr0Var;
        qr0Var2.getClass();
        qr0VarArr[0].setVisibility(0);
        qr0VarArr[0].setScaleX(0.8f);
        qr0VarArr[0].setScaleY(0.8f);
        qr0VarArr[0].setAlpha(0.0f);
        qr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = qr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        is isVar = is.h;
        org.telegram.messenger.bi.t(translationY, isVar, 320L);
        qr0 qr0Var3 = qr0VarArr[1];
        qr0Var3.getClass();
        qr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(isVar).setDuration(320L).withEndAction(new pr0(qr0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f30841c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f30841c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (qr0 qr0Var : this.f30839a) {
            qr0Var.f30277a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(rr0 rr0Var) {
        this.H = rr0Var;
    }
}
