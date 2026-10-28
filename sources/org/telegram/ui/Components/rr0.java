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
public final class rr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public np0 G;
    public qr0 H;
    public final pr0[] f32326a;
    public int f32327b;
    public int f32328c;
    public long d;
    public ArrayList e;
    public final ArrayList f32329f;
    public boolean h;
    public boolean f32330n;
    public String f32331r;
    public final ArrayList f32332s;
    public final HashMap v;
    public TLRPC.WebPage f32333w;
    public int f32334x;
    public int f32335y;

    public rr0(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.f32326a = new pr0[2];
        this.f32327b = 0;
        this.f32329f = new ArrayList();
        this.f32330n = true;
        this.f32332s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            pr0[] pr0VarArr = this.f32326a;
            if (i10 < pr0VarArr.length) {
                pr0VarArr[i10] = new pr0(this, activity, u6Var);
                addView(this.f32326a[i10], kb1.g(-1.0f, -1));
                i10++;
            } else {
                pr0VarArr[0].setVisibility(0);
                this.f32326a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(pr0 pr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = pr0Var.f31706b;
        y9 y9Var = pr0Var.f31709n;
        imageView.setImageResource(R.drawable.msg_link2);
        pr0Var.f31706b.setVisibility(0);
        pr0Var.f31708f.setVisibility(8);
        pr0Var.f31710r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        pr0Var.f31707c.l(str2, false);
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
        pr0Var.d.l(str3, false);
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
        pr0Var.f31705a.setClickable(false);
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
            y9Var.g(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                y9Var.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            y9Var.p(photoEntry.orientation, photoEntry.invert, true);
            y9Var.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            y9Var.setImageDrawable(null);
        }
    }

    public final String c(pr0 pr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f32329f;
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
                    shortName = DialogObject.getName(this.f32328c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f32328c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.b6 b6Var = pr0Var.d;
        if (b6Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = b6Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && b6Var.getPaint().measureText(formatString) <= f7) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f32334x != 0) {
            AccountInstance.getInstance(this.f32328c).getConnectionsManager().cancelRequest(this.f32334x, true);
            this.f32334x = 0;
        }
        this.f32335y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f32333w != null && i11 == this.f32328c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f22183id == this.f32333w.f22183id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f32333w = null;
                        d();
                        if (this.f32327b != 0) {
                            this.f32327b = 0;
                            qr0 qr0Var = this.H;
                            if (qr0Var != null) {
                                ((org.telegram.ui.kv) qr0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f32333w = webPage;
                        ArrayList arrayList = this.f32332s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f32326a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rr0.e(java.lang.CharSequence, boolean):void");
    }

    public final y9 f(int i10) {
        y9[] y9VarArr;
        if (this.f32327b == 1 && (y9VarArr = this.f32326a[0].h) != null && i10 >= 0 && i10 < y9VarArr.length && y9VarArr[i10].getVisibility() == 0) {
            return y9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f32330n = true;
        this.f32331r = null;
        this.f32333w = null;
        d();
        this.f32332s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f32333w;
    }

    public int getMode() {
        return this.f32327b;
    }

    public final void h(int i10) {
        if (this.f32328c == i10) {
            this.f32328c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f32328c).addWeakObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f32328c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f32328c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f32328c).addWeakObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        qr0 qr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f32333w = null;
        d();
        this.f32332s.clear();
        int i12 = this.f32327b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32327b = 1;
        if (z10) {
            k();
        }
        pr0[] pr0VarArr = this.f32326a;
        pr0 pr0Var = pr0VarArr[0];
        ImageView imageView = pr0Var.f31706b;
        org.telegram.ui.ActionBar.b6 b6Var = pr0Var.d;
        y9[] y9VarArr = pr0Var.h;
        org.telegram.ui.ActionBar.b6 b6Var2 = pr0Var.f31707c;
        imageView.setImageResource(R.drawable.filled_forward);
        pr0Var.f31706b.setVisibility(0);
        pr0Var.f31709n.setVisibility(8);
        pr0Var.f31708f.setVisibility(0);
        pr0Var.f31710r.setVisibility(8);
        pr0Var.f31705a.setClickable(true);
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
                b6Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                b6Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                b6Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                b6Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            b6Var.l(c(pr0Var), false);
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
            b6Var2.l("", false);
            b6Var.l("", false);
            for (y9 y9Var4 : y9VarArr) {
                y9Var4.setVisibility(8);
            }
        }
        pr0 pr0Var2 = pr0VarArr[0];
        String str = this.F;
        if (str != null) {
            pr0Var2.e.l(str, false);
        }
        int i16 = this.f32327b;
        if (i12 != i16 && (qr0Var = this.H) != null) {
            ((org.telegram.ui.kv) qr0Var).i(i16);
        }
    }

    public final void j() {
        pr0[] pr0VarArr;
        np0 np0Var = this.G;
        if (np0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(np0Var);
            this.G = null;
        }
        this.E = false;
        for (pr0 pr0Var : this.f32326a) {
            org.telegram.ui.ActionBar.b6 b6Var = pr0Var.d;
            b6Var.setAlpha(1.0f);
            b6Var.setScaleX(1.0f);
            b6Var.setScaleY(1.0f);
            pr0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        pr0[] pr0VarArr = this.f32326a;
        pr0 pr0Var = pr0VarArr[0];
        pr0 pr0Var2 = pr0VarArr[1];
        pr0VarArr[0] = pr0Var2;
        pr0VarArr[1] = pr0Var;
        pr0Var2.getClass();
        pr0VarArr[0].setVisibility(0);
        pr0VarArr[0].setScaleX(0.8f);
        pr0VarArr[0].setScaleY(0.8f);
        pr0VarArr[0].setAlpha(0.0f);
        pr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = pr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        ds dsVar = ds.h;
        org.telegram.messenger.wh.q(translationY, dsVar, 320L);
        pr0 pr0Var3 = pr0VarArr[1];
        pr0Var3.getClass();
        pr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(dsVar).setDuration(320L).withEndAction(new np0(pr0Var3, 4)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f32328c).addWeakObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f32328c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (pr0 pr0Var : this.f32326a) {
            pr0Var.f31705a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(qr0 qr0Var) {
        this.H = qr0Var;
    }
}
