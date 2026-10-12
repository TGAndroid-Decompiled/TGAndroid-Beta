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
public final class xr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public ur0 G;
    public wr0 H;
    public final vr0[] f32834a;
    public int f32835b;
    public int f32836c;
    public long d;
    public ArrayList f32837e;
    public final ArrayList f32838f;
    public boolean h;
    public boolean f32839n;
    public String f32840r;
    public final ArrayList f32841s;
    public final HashMap v;
    public TLRPC.WebPage f32842w;
    public int f32843x;
    public int f32844y;

    public xr0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f32834a = new vr0[2];
        this.f32835b = 0;
        this.f32838f = new ArrayList();
        this.f32839n = true;
        this.f32841s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            vr0[] vr0VarArr = this.f32834a;
            if (i10 < vr0VarArr.length) {
                vr0VarArr[i10] = new vr0(this, activity, c6Var);
                addView(this.f32834a[i10], w7.w5.d(-1.0f, -1));
                i10++;
            } else {
                vr0VarArr[0].setVisibility(0);
                this.f32834a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(vr0 vr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = vr0Var.f32179b;
        y9 y9Var = vr0Var.f32183n;
        imageView.setImageResource(R.drawable.msg_link2);
        vr0Var.f32179b.setVisibility(0);
        vr0Var.f32182f.setVisibility(8);
        vr0Var.f32184r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        vr0Var.f32180c.l(str2, false);
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
        vr0Var.d.l(str3, false);
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
        vr0Var.f32178a.setClickable(false);
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

    public final String c(vr0 vr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f32838f;
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
                    shortName = DialogObject.getName(this.f32836c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f32836c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = vr0Var.d;
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
        if (this.f32843x != 0) {
            AccountInstance.getInstance(this.f32836c).getConnectionsManager().cancelRequest(this.f32843x, true);
            this.f32843x = 0;
        }
        this.f32844y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f32842w != null && i11 == this.f32836c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f19955id == this.f32842w.f19955id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f32842w = null;
                        d();
                        if (this.f32835b != 0) {
                            this.f32835b = 0;
                            wr0 wr0Var = this.H;
                            if (wr0Var != null) {
                                ((org.telegram.ui.xv) wr0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f32842w = webPage;
                        ArrayList arrayList = this.f32841s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f32834a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xr0.e(java.lang.CharSequence, boolean):void");
    }

    public final y9 f(int i10) {
        y9[] y9VarArr;
        if (this.f32835b == 1 && (y9VarArr = this.f32834a[0].h) != null && i10 >= 0 && i10 < y9VarArr.length && y9VarArr[i10].getVisibility() == 0) {
            return y9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f32837e = null;
        this.h = true;
        this.f32839n = true;
        this.f32840r = null;
        this.f32842w = null;
        d();
        this.f32841s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f32842w;
    }

    public int getMode() {
        return this.f32835b;
    }

    public final void h(int i10) {
        if (this.f32836c == i10) {
            this.f32836c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f32836c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f32836c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f32836c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f32836c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        wr0 wr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f32837e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f32842w = null;
        d();
        this.f32841s.clear();
        int i12 = this.f32835b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32835b = 1;
        if (z10) {
            k();
        }
        vr0[] vr0VarArr = this.f32834a;
        vr0 vr0Var = vr0VarArr[0];
        ImageView imageView = vr0Var.f32179b;
        org.telegram.ui.ActionBar.h5 h5Var = vr0Var.d;
        y9[] y9VarArr = vr0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = vr0Var.f32180c;
        imageView.setImageResource(R.drawable.filled_forward);
        vr0Var.f32179b.setVisibility(0);
        vr0Var.f32183n.setVisibility(8);
        vr0Var.f32182f.setVisibility(0);
        vr0Var.f32184r.setVisibility(8);
        vr0Var.f32178a.setClickable(true);
        ArrayList arrayList2 = this.f32837e;
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
            h5Var.l(c(vr0Var), false);
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
            h5Var2.l("", false);
            h5Var.l("", false);
            for (y9 y9Var4 : y9VarArr) {
                y9Var4.setVisibility(8);
            }
        }
        vr0 vr0Var2 = vr0VarArr[0];
        String str = this.F;
        if (str != null) {
            vr0Var2.f32181e.l(str, false);
        }
        int i16 = this.f32835b;
        if (i12 != i16 && (wr0Var = this.H) != null) {
            ((org.telegram.ui.xv) wr0Var).h(i16);
        }
    }

    public final void j() {
        vr0[] vr0VarArr;
        ur0 ur0Var = this.G;
        if (ur0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ur0Var);
            this.G = null;
        }
        this.E = false;
        for (vr0 vr0Var : this.f32834a) {
            org.telegram.ui.ActionBar.h5 h5Var = vr0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            vr0Var.f32181e.setAlpha(0.0f);
        }
    }

    public final void k() {
        vr0[] vr0VarArr = this.f32834a;
        vr0 vr0Var = vr0VarArr[0];
        vr0 vr0Var2 = vr0VarArr[1];
        vr0VarArr[0] = vr0Var2;
        vr0VarArr[1] = vr0Var;
        vr0Var2.getClass();
        vr0VarArr[0].setVisibility(0);
        vr0VarArr[0].setScaleX(0.8f);
        vr0VarArr[0].setScaleY(0.8f);
        vr0VarArr[0].setAlpha(0.0f);
        vr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = vr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        js jsVar = js.h;
        org.telegram.messenger.am.t(translationY, jsVar, 320L);
        vr0 vr0Var3 = vr0VarArr[1];
        vr0Var3.getClass();
        vr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(jsVar).setDuration(320L).withEndAction(new ur0(vr0Var3, 1)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f32836c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f32836c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (vr0 vr0Var : this.f32834a) {
            vr0Var.f32178a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(wr0 wr0Var) {
        this.H = wr0Var;
    }
}
