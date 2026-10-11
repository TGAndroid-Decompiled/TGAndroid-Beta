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
public final class tr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public cd0 G;
    public sr0 H;
    public final rr0[] f31135a;
    public int f31136b;
    public int f31137c;
    public long d;
    public ArrayList f31138e;
    public final ArrayList f31139f;
    public boolean h;
    public boolean f31140n;
    public String f31141r;
    public final ArrayList f31142s;
    public final HashMap v;
    public TLRPC.WebPage f31143w;
    public int f31144x;
    public int f31145y;

    public tr0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f31135a = new rr0[2];
        this.f31136b = 0;
        this.f31139f = new ArrayList();
        this.f31140n = true;
        this.f31142s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f31135a;
            if (i10 < rr0VarArr.length) {
                rr0VarArr[i10] = new rr0(this, activity, d6Var);
                addView(this.f31135a[i10], w7.x5.d(-1.0f, -1));
                i10++;
            } else {
                rr0VarArr[0].setVisibility(0);
                this.f31135a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(rr0 rr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = rr0Var.f30530b;
        y9 y9Var = rr0Var.f30534n;
        imageView.setImageResource(R.drawable.msg_link2);
        rr0Var.f30530b.setVisibility(0);
        rr0Var.f30533f.setVisibility(8);
        rr0Var.f30535r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        rr0Var.f30531c.l(str2, false);
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
        rr0Var.d.l(str3, false);
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
        rr0Var.f30529a.setClickable(false);
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

    public final String c(rr0 rr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f31139f;
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
                    shortName = DialogObject.getName(this.f31137c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f31137c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = rr0Var.d;
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
        if (this.f31144x != 0) {
            AccountInstance.getInstance(this.f31137c).getConnectionsManager().cancelRequest(this.f31144x, true);
            this.f31144x = 0;
        }
        this.f31145y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f31143w != null && i11 == this.f31137c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f20185id == this.f31143w.f20185id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f31143w = null;
                        d();
                        if (this.f31136b != 0) {
                            this.f31136b = 0;
                            sr0 sr0Var = this.H;
                            if (sr0Var != null) {
                                ((org.telegram.ui.uv) sr0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f31143w = webPage;
                        ArrayList arrayList = this.f31142s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f31135a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tr0.e(java.lang.CharSequence, boolean):void");
    }

    public final y9 f(int i10) {
        y9[] y9VarArr;
        if (this.f31136b == 1 && (y9VarArr = this.f31135a[0].h) != null && i10 >= 0 && i10 < y9VarArr.length && y9VarArr[i10].getVisibility() == 0) {
            return y9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f31138e = null;
        this.h = true;
        this.f31140n = true;
        this.f31141r = null;
        this.f31143w = null;
        d();
        this.f31142s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f31143w;
    }

    public int getMode() {
        return this.f31136b;
    }

    public final void h(int i10) {
        if (this.f31137c == i10) {
            this.f31137c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f31137c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f31137c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f31137c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f31137c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        sr0 sr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f31138e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f31143w = null;
        d();
        this.f31142s.clear();
        int i12 = this.f31136b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31136b = 1;
        if (z10) {
            k();
        }
        rr0[] rr0VarArr = this.f31135a;
        rr0 rr0Var = rr0VarArr[0];
        ImageView imageView = rr0Var.f30530b;
        org.telegram.ui.ActionBar.h5 h5Var = rr0Var.d;
        y9[] y9VarArr = rr0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = rr0Var.f30531c;
        imageView.setImageResource(R.drawable.filled_forward);
        rr0Var.f30530b.setVisibility(0);
        rr0Var.f30534n.setVisibility(8);
        rr0Var.f30533f.setVisibility(0);
        rr0Var.f30535r.setVisibility(8);
        rr0Var.f30529a.setClickable(true);
        ArrayList arrayList2 = this.f31138e;
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
            h5Var.l(c(rr0Var), false);
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
        rr0 rr0Var2 = rr0VarArr[0];
        String str = this.F;
        if (str != null) {
            rr0Var2.f30532e.l(str, false);
        }
        int i16 = this.f31136b;
        if (i12 != i16 && (sr0Var = this.H) != null) {
            ((org.telegram.ui.uv) sr0Var).h(i16);
        }
    }

    public final void j() {
        rr0[] rr0VarArr;
        cd0 cd0Var = this.G;
        if (cd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cd0Var);
            this.G = null;
        }
        this.E = false;
        for (rr0 rr0Var : this.f31135a) {
            org.telegram.ui.ActionBar.h5 h5Var = rr0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            rr0Var.f30532e.setAlpha(0.0f);
        }
    }

    public final void k() {
        rr0[] rr0VarArr = this.f31135a;
        rr0 rr0Var = rr0VarArr[0];
        rr0 rr0Var2 = rr0VarArr[1];
        rr0VarArr[0] = rr0Var2;
        rr0VarArr[1] = rr0Var;
        rr0Var2.getClass();
        rr0VarArr[0].setVisibility(0);
        rr0VarArr[0].setScaleX(0.8f);
        rr0VarArr[0].setScaleY(0.8f);
        rr0VarArr[0].setAlpha(0.0f);
        rr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = rr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        is isVar = is.h;
        org.telegram.messenger.ai.t(translationY, isVar, 320L);
        rr0 rr0Var3 = rr0VarArr[1];
        rr0Var3.getClass();
        rr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(isVar).setDuration(320L).withEndAction(new qr0(rr0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f31137c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f31137c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (rr0 rr0Var : this.f31135a) {
            rr0Var.f30529a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(sr0 sr0Var) {
        this.H = sr0Var;
    }
}
