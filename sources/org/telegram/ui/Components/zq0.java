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
public final class zq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public wq0 G;
    public yq0 H;
    public final xq0[] f30963a;
    public int f30964b;
    public int f30965c;
    public long d;
    public ArrayList e;
    public final ArrayList f30966f;
    public boolean h;
    public boolean f30967n;
    public String f30968r;
    public final ArrayList f30969s;
    public final HashMap v;
    public TLRPC.WebPage f30970w;
    public int f30971x;
    public int f30972y;

    public zq0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f30963a = new xq0[2];
        this.f30964b = 0;
        this.f30966f = new ArrayList();
        this.f30967n = true;
        this.f30969s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            xq0[] xq0VarArr = this.f30963a;
            if (i10 < xq0VarArr.length) {
                xq0VarArr[i10] = new xq0(this, activity, d6Var);
                addView(this.f30963a[i10], w7.y5.c(-1.0f, -1));
                i10++;
            } else {
                xq0VarArr[0].setVisibility(0);
                this.f30963a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(xq0 xq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = xq0Var.f30388b;
        w9 w9Var = xq0Var.f30391n;
        imageView.setImageResource(R.drawable.msg_link2);
        xq0Var.f30388b.setVisibility(0);
        xq0Var.f30390f.setVisibility(8);
        xq0Var.f30392r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        xq0Var.f30389c.l(str2, false);
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
        xq0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                w9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                w9Var.setVisibility(0);
            } else {
                w9Var.setVisibility(8);
            }
        } else {
            w9Var.setVisibility(8);
        }
        xq0Var.f30387a.setClickable(false);
    }

    public static void b(w9 w9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            w9Var.setVisibility(8);
            return;
        }
        w9Var.setVisibility(0);
        w9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            w9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            w9Var.p(photoEntry.orientation, photoEntry.invert, true);
            w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            w9Var.setImageDrawable(null);
        }
    }

    public final String c(xq0 xq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f30966f;
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
                    shortName = DialogObject.getName(this.f30965c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f30965c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = xq0Var.d;
        if (h5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = h5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && h5Var.getPaint().measureText(formatString) <= f7) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f30971x != 0) {
            AccountInstance.getInstance(this.f30965c).getConnectionsManager().cancelRequest(this.f30971x, true);
            this.f30971x = 0;
        }
        this.f30972y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f30970w != null && i11 == this.f30965c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f18489id == this.f30970w.f18489id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f30970w = null;
                        d();
                        if (this.f30964b != 0) {
                            this.f30964b = 0;
                            yq0 yq0Var = this.H;
                            if (yq0Var != null) {
                                ((org.telegram.ui.sv) yq0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f30970w = webPage;
                        ArrayList arrayList = this.f30969s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f30963a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zq0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f30964b == 1 && (w9VarArr = this.f30963a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f30967n = true;
        this.f30968r = null;
        this.f30970w = null;
        d();
        this.f30969s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f30970w;
    }

    public int getMode() {
        return this.f30964b;
    }

    public final void h(int i10) {
        if (this.f30965c == i10) {
            this.f30965c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f30965c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30965c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f30965c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30965c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        yq0 yq0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f30970w = null;
        d();
        this.f30969s.clear();
        int i12 = this.f30964b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30964b = 1;
        if (z10) {
            k();
        }
        xq0[] xq0VarArr = this.f30963a;
        xq0 xq0Var = xq0VarArr[0];
        ImageView imageView = xq0Var.f30388b;
        org.telegram.ui.ActionBar.h5 h5Var = xq0Var.d;
        w9[] w9VarArr = xq0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = xq0Var.f30389c;
        imageView.setImageResource(R.drawable.filled_forward);
        xq0Var.f30388b.setVisibility(0);
        xq0Var.f30391n.setVisibility(8);
        xq0Var.f30390f.setVisibility(0);
        xq0Var.f30392r.setVisibility(8);
        xq0Var.f30387a.setClickable(true);
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
                h5Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                h5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            h5Var.l(c(xq0Var), false);
            w9 w9Var = w9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(w9Var, photoEntry);
            w9 w9Var2 = w9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(w9Var2, photoEntry2);
            w9 w9Var3 = w9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(w9Var3, photoEntry3);
        } else {
            h5Var2.l("", false);
            h5Var.l("", false);
            for (w9 w9Var4 : w9VarArr) {
                w9Var4.setVisibility(8);
            }
        }
        xq0 xq0Var2 = xq0VarArr[0];
        String str = this.F;
        if (str != null) {
            xq0Var2.e.l(str, false);
        }
        int i16 = this.f30964b;
        if (i12 != i16 && (yq0Var = this.H) != null) {
            ((org.telegram.ui.sv) yq0Var).h(i16);
        }
    }

    public final void j() {
        xq0[] xq0VarArr;
        wq0 wq0Var = this.G;
        if (wq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wq0Var);
            this.G = null;
        }
        this.E = false;
        for (xq0 xq0Var : this.f30963a) {
            org.telegram.ui.ActionBar.h5 h5Var = xq0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            xq0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        xq0[] xq0VarArr = this.f30963a;
        xq0 xq0Var = xq0VarArr[0];
        xq0 xq0Var2 = xq0VarArr[1];
        xq0VarArr[0] = xq0Var2;
        xq0VarArr[1] = xq0Var;
        xq0Var2.getClass();
        xq0VarArr[0].setVisibility(0);
        xq0VarArr[0].setScaleX(0.8f);
        xq0VarArr[0].setScaleY(0.8f);
        xq0VarArr[0].setAlpha(0.0f);
        xq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = xq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        rr rrVar = rr.h;
        org.telegram.messenger.ok.s(translationY, rrVar, 320L);
        xq0 xq0Var3 = xq0VarArr[1];
        xq0Var3.getClass();
        xq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(rrVar).setDuration(320L).withEndAction(new wq0(xq0Var3, 1)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f30965c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f30965c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (xq0 xq0Var : this.f30963a) {
            xq0Var.f30387a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(yq0 yq0Var) {
        this.H = yq0Var;
    }
}
