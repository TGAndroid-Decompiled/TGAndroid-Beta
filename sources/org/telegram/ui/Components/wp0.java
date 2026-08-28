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
public final class wp0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int E = 0;
    public boolean A;
    public String B;
    public ib0 C;
    public vp0 D;
    public final up0[] f34305a;
    public int f34306b;
    public int f34307c;
    public long d;
    public ArrayList f34308e;
    public final ArrayList f34309f;
    public boolean h;
    public boolean f34310n;
    public String f34311r;
    public final ArrayList f34312s;
    public final HashMap v;
    public TLRPC.WebPage f34313w;
    public int f34314x;
    public int f34315y;

    public wp0(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.f34305a = new up0[2];
        this.f34306b = 0;
        this.f34309f = new ArrayList();
        this.f34310n = true;
        this.f34312s = new ArrayList();
        this.v = new HashMap();
        int i9 = 0;
        while (true) {
            up0[] up0VarArr = this.f34305a;
            if (i9 < up0VarArr.length) {
                up0VarArr[i9] = new up0(this, activity, b6Var);
                addView(this.f34305a[i9], g7.e6.c(-1.0f, -1));
                i9++;
            } else {
                up0VarArr[0].setVisibility(0);
                this.f34305a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(up0 up0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = up0Var.f33107b;
        o9 o9Var = up0Var.f33111n;
        imageView.setImageResource(R.drawable.msg_link2);
        up0Var.f33107b.setVisibility(0);
        up0Var.f33110f.setVisibility(8);
        up0Var.f33112r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        up0Var.f33108c.l(str2, false);
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
        up0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                o9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                o9Var.setVisibility(0);
            } else {
                o9Var.setVisibility(8);
            }
        } else {
            o9Var.setVisibility(8);
        }
        up0Var.f33106a.setClickable(false);
    }

    public static void b(o9 o9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            o9Var.setVisibility(8);
            return;
        }
        o9Var.setVisibility(0);
        o9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            o9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                o9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            o9Var.p(photoEntry.orientation, photoEntry.invert, true);
            o9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            o9Var.setImageDrawable(null);
        }
    }

    public final String c(up0 up0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f34309f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                if (arrayList.size() == 1) {
                    shortName = DialogObject.getName(this.f34307c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f34307c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
        if (h5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = h5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && h5Var.getPaint().measureText(formatString) <= f10) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f34314x != 0) {
            AccountInstance.getInstance(this.f34307c).getConnectionsManager().cancelRequest(this.f34314x, true);
            this.f34314x = 0;
        }
        this.f34315y++;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        String str;
        if (i9 == NotificationCenter.didReceivedWebpagesInUpdates && this.f34313w != null && i10 == this.f34307c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f22533id == this.f34313w.f22533id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f34313w = null;
                        d();
                        if (this.f34306b != 0) {
                            this.f34306b = 0;
                            vp0 vp0Var = this.D;
                            if (vp0Var != null) {
                                ((org.telegram.ui.jv) vp0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f34313w = webPage;
                        ArrayList arrayList = this.f34312s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f34305a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp0.e(java.lang.CharSequence, boolean):void");
    }

    public final o9 f(int i9) {
        o9[] o9VarArr;
        if (this.f34306b == 1 && (o9VarArr = this.f34305a[0].h) != null && i9 >= 0 && i9 < o9VarArr.length && o9VarArr[i9].getVisibility() == 0) {
            return o9VarArr[i9];
        }
        return null;
    }

    public final void g(int i9) {
        h(i9);
        this.d = AccountInstance.getInstance(i9).getUserConfig().getClientUserId();
        this.f34308e = null;
        this.h = true;
        this.f34310n = true;
        this.f34311r = null;
        this.f34313w = null;
        d();
        this.f34312s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f34313w;
    }

    public int getMode() {
        return this.f34306b;
    }

    public final void h(int i9) {
        if (this.f34307c == i9) {
            this.f34307c = i9;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f34307c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f34307c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f34307c = i9;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f34307c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i9, ArrayList arrayList) {
        boolean z10;
        vp0 vp0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i10;
        h(i9);
        this.d = AccountInstance.getInstance(i9).getUserConfig().getClientUserId();
        this.f34308e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f34313w = null;
        d();
        this.f34312s.clear();
        int i11 = this.f34306b;
        if (i11 != 1 && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34306b = 1;
        if (z10) {
            k();
        }
        up0[] up0VarArr = this.f34305a;
        up0 up0Var = up0VarArr[0];
        ImageView imageView = up0Var.f33107b;
        org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
        o9[] o9VarArr = up0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = up0Var.f33108c;
        imageView.setImageResource(R.drawable.filled_forward);
        up0Var.f33107b.setVisibility(0);
        up0Var.f33111n.setVisibility(8);
        up0Var.f33110f.setVisibility(0);
        up0Var.f33112r.setVisibility(8);
        up0Var.f33106a.setClickable(true);
        ArrayList arrayList2 = this.f34308e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((MediaController.PhotoEntry) arrayList2.get(0)).isVideo) {
                    i10 = R.string.ShareSendVideo;
                } else {
                    i10 = R.string.ShareSendPhoto;
                }
                h5Var2.l(LocaleController.getString(i10), false);
            } else if (i12 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i13 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                h5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            h5Var.l(c(up0Var), false);
            o9 o9Var = o9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(o9Var, photoEntry);
            o9 o9Var2 = o9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(o9Var2, photoEntry2);
            o9 o9Var3 = o9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(o9Var3, photoEntry3);
        } else {
            h5Var2.l("", false);
            h5Var.l("", false);
            for (o9 o9Var4 : o9VarArr) {
                o9Var4.setVisibility(8);
            }
        }
        up0 up0Var2 = up0VarArr[0];
        String str = this.B;
        if (str != null) {
            up0Var2.f33109e.l(str, false);
        }
        int i15 = this.f34306b;
        if (i11 != i15 && (vp0Var = this.D) != null) {
            ((org.telegram.ui.jv) vp0Var).h(i15);
        }
    }

    public final void j() {
        up0[] up0VarArr;
        ib0 ib0Var = this.C;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.C = null;
        }
        this.A = false;
        for (up0 up0Var : this.f34305a) {
            org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            up0Var.f33109e.setAlpha(0.0f);
        }
    }

    public final void k() {
        up0[] up0VarArr = this.f34305a;
        up0 up0Var = up0VarArr[0];
        up0 up0Var2 = up0VarArr[1];
        up0VarArr[0] = up0Var2;
        up0VarArr[1] = up0Var;
        up0Var2.getClass();
        up0VarArr[0].setVisibility(0);
        up0VarArr[0].setScaleX(0.8f);
        up0VarArr[0].setScaleY(0.8f);
        up0VarArr[0].setAlpha(0.0f);
        up0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = up0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        org.telegram.messenger.ll.r(translationY, grVar, 320L);
        up0 up0Var3 = up0VarArr[1];
        up0Var3.getClass();
        up0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new tp0(up0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f34307c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f34307c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (up0 up0Var : this.f34305a) {
            up0Var.f33106a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(vp0 vp0Var) {
        this.D = vp0Var;
    }
}
