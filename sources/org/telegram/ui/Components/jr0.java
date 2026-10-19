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
public final class jr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public rc0 G;
    public ir0 H;
    public final hr0[] f27584a;
    public int f27585b;
    public int f27586c;
    public long d;
    public ArrayList e;
    public final ArrayList f27587f;
    public boolean h;
    public boolean f27588n;
    public String f27589r;
    public final ArrayList f27590s;
    public final HashMap v;
    public TLRPC.WebPage f27591w;
    public int f27592x;
    public int f27593y;

    public jr0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f27584a = new hr0[2];
        this.f27585b = 0;
        this.f27587f = new ArrayList();
        this.f27588n = true;
        this.f27590s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            hr0[] hr0VarArr = this.f27584a;
            if (i10 < hr0VarArr.length) {
                hr0VarArr[i10] = new hr0(this, activity, d6Var);
                addView(this.f27584a[i10], w7.z5.c(-1.0f, -1));
                i10++;
            } else {
                hr0VarArr[0].setVisibility(0);
                this.f27584a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(hr0 hr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = hr0Var.f26921b;
        w9 w9Var = hr0Var.f26924n;
        imageView.setImageResource(R.drawable.msg_link2);
        hr0Var.f26921b.setVisibility(0);
        hr0Var.f26923f.setVisibility(8);
        hr0Var.f26925r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        hr0Var.f26922c.l(str2, false);
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
        hr0Var.d.l(str3, false);
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
        hr0Var.f26920a.setClickable(false);
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

    public final String c(hr0 hr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f27587f;
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
                    shortName = DialogObject.getName(this.f27586c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f27586c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = hr0Var.d;
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
        if (this.f27592x != 0) {
            AccountInstance.getInstance(this.f27586c).getConnectionsManager().cancelRequest(this.f27592x, true);
            this.f27592x = 0;
        }
        this.f27593y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f27591w != null && i11 == this.f27586c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f20426id == this.f27591w.f20426id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f27591w = null;
                        d();
                        if (this.f27585b != 0) {
                            this.f27585b = 0;
                            ir0 ir0Var = this.H;
                            if (ir0Var != null) {
                                ((org.telegram.ui.hv) ir0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f27591w = webPage;
                        ArrayList arrayList = this.f27590s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f27584a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jr0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f27585b == 1 && (w9VarArr = this.f27584a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f27588n = true;
        this.f27589r = null;
        this.f27591w = null;
        d();
        this.f27590s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f27591w;
    }

    public int getMode() {
        return this.f27585b;
    }

    public final void h(int i10) {
        if (this.f27586c == i10) {
            this.f27586c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f27586c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f27586c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f27586c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f27586c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        ir0 ir0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f27591w = null;
        d();
        this.f27590s.clear();
        int i12 = this.f27585b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27585b = 1;
        if (z10) {
            k();
        }
        hr0[] hr0VarArr = this.f27584a;
        hr0 hr0Var = hr0VarArr[0];
        ImageView imageView = hr0Var.f26921b;
        org.telegram.ui.ActionBar.j5 j5Var = hr0Var.d;
        w9[] w9VarArr = hr0Var.h;
        org.telegram.ui.ActionBar.j5 j5Var2 = hr0Var.f26922c;
        imageView.setImageResource(R.drawable.filled_forward);
        hr0Var.f26921b.setVisibility(0);
        hr0Var.f26924n.setVisibility(8);
        hr0Var.f26923f.setVisibility(0);
        hr0Var.f26925r.setVisibility(8);
        hr0Var.f26920a.setClickable(true);
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
                j5Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                j5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                j5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                j5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            j5Var.l(c(hr0Var), false);
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
            j5Var2.l("", false);
            j5Var.l("", false);
            for (w9 w9Var4 : w9VarArr) {
                w9Var4.setVisibility(8);
            }
        }
        hr0 hr0Var2 = hr0VarArr[0];
        String str = this.F;
        if (str != null) {
            hr0Var2.e.l(str, false);
        }
        int i16 = this.f27585b;
        if (i12 != i16 && (ir0Var = this.H) != null) {
            ((org.telegram.ui.hv) ir0Var).h(i16);
        }
    }

    public final void j() {
        hr0[] hr0VarArr;
        rc0 rc0Var = this.G;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
            this.G = null;
        }
        this.E = false;
        for (hr0 hr0Var : this.f27584a) {
            org.telegram.ui.ActionBar.j5 j5Var = hr0Var.d;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            hr0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        hr0[] hr0VarArr = this.f27584a;
        hr0 hr0Var = hr0VarArr[0];
        hr0 hr0Var2 = hr0VarArr[1];
        hr0VarArr[0] = hr0Var2;
        hr0VarArr[1] = hr0Var;
        hr0Var2.getClass();
        hr0VarArr[0].setVisibility(0);
        hr0VarArr[0].setScaleX(0.8f);
        hr0VarArr[0].setScaleY(0.8f);
        hr0VarArr[0].setAlpha(0.0f);
        hr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = hr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        bs bsVar = bs.h;
        org.telegram.messenger.kk.t(translationY, bsVar, 320L);
        hr0 hr0Var3 = hr0VarArr[1];
        hr0Var3.getClass();
        hr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(bsVar).setDuration(320L).withEndAction(new gr0(hr0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f27586c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f27586c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (hr0 hr0Var : this.f27584a) {
            hr0Var.f26920a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(ir0 ir0Var) {
        this.H = ir0Var;
    }
}
