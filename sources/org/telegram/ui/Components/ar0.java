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
public final class ar0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public kc0 G;
    public zq0 H;
    public final yq0[] f22702a;
    public int f22703b;
    public int f22704c;
    public long d;
    public ArrayList e;
    public final ArrayList f22705f;
    public boolean h;
    public boolean f22706n;
    public String f22707r;
    public final ArrayList f22708s;
    public final HashMap v;
    public TLRPC.WebPage f22709w;
    public int f22710x;
    public int f22711y;

    public ar0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f22702a = new yq0[2];
        this.f22703b = 0;
        this.f22705f = new ArrayList();
        this.f22706n = true;
        this.f22708s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            yq0[] yq0VarArr = this.f22702a;
            if (i10 < yq0VarArr.length) {
                yq0VarArr[i10] = new yq0(this, activity, e6Var);
                addView(this.f22702a[i10], w7.y5.c(-1.0f, -1));
                i10++;
            } else {
                yq0VarArr[0].setVisibility(0);
                this.f22702a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(yq0 yq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = yq0Var.f30651b;
        w9 w9Var = yq0Var.f30654n;
        imageView.setImageResource(R.drawable.msg_link2);
        yq0Var.f30651b.setVisibility(0);
        yq0Var.f30653f.setVisibility(8);
        yq0Var.f30655r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        yq0Var.f30652c.l(str2, false);
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
        yq0Var.d.l(str3, false);
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
        yq0Var.f30650a.setClickable(false);
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

    public final String c(yq0 yq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f22705f;
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
                    shortName = DialogObject.getName(this.f22704c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f22704c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = yq0Var.d;
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
        if (this.f22710x != 0) {
            AccountInstance.getInstance(this.f22704c).getConnectionsManager().cancelRequest(this.f22710x, true);
            this.f22710x = 0;
        }
        this.f22711y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f22709w != null && i11 == this.f22704c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f18449id == this.f22709w.f18449id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f22709w = null;
                        d();
                        if (this.f22703b != 0) {
                            this.f22703b = 0;
                            zq0 zq0Var = this.H;
                            if (zq0Var != null) {
                                ((org.telegram.ui.xv) zq0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f22709w = webPage;
                        ArrayList arrayList = this.f22708s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f22702a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ar0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f22703b == 1 && (w9VarArr = this.f22702a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f22706n = true;
        this.f22707r = null;
        this.f22709w = null;
        d();
        this.f22708s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f22709w;
    }

    public int getMode() {
        return this.f22703b;
    }

    public final void h(int i10) {
        if (this.f22704c == i10) {
            this.f22704c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f22704c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f22704c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f22704c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f22704c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        zq0 zq0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f22709w = null;
        d();
        this.f22708s.clear();
        int i12 = this.f22703b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22703b = 1;
        if (z10) {
            k();
        }
        yq0[] yq0VarArr = this.f22702a;
        yq0 yq0Var = yq0VarArr[0];
        ImageView imageView = yq0Var.f30651b;
        org.telegram.ui.ActionBar.j5 j5Var = yq0Var.d;
        w9[] w9VarArr = yq0Var.h;
        org.telegram.ui.ActionBar.j5 j5Var2 = yq0Var.f30652c;
        imageView.setImageResource(R.drawable.filled_forward);
        yq0Var.f30651b.setVisibility(0);
        yq0Var.f30654n.setVisibility(8);
        yq0Var.f30653f.setVisibility(0);
        yq0Var.f30655r.setVisibility(8);
        yq0Var.f30650a.setClickable(true);
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
            j5Var.l(c(yq0Var), false);
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
        yq0 yq0Var2 = yq0VarArr[0];
        String str = this.F;
        if (str != null) {
            yq0Var2.e.l(str, false);
        }
        int i16 = this.f22703b;
        if (i12 != i16 && (zq0Var = this.H) != null) {
            ((org.telegram.ui.xv) zq0Var).h(i16);
        }
    }

    public final void j() {
        yq0[] yq0VarArr;
        kc0 kc0Var = this.G;
        if (kc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kc0Var);
            this.G = null;
        }
        this.E = false;
        for (yq0 yq0Var : this.f22702a) {
            org.telegram.ui.ActionBar.j5 j5Var = yq0Var.d;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            yq0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        yq0[] yq0VarArr = this.f22702a;
        yq0 yq0Var = yq0VarArr[0];
        yq0 yq0Var2 = yq0VarArr[1];
        yq0VarArr[0] = yq0Var2;
        yq0VarArr[1] = yq0Var;
        yq0Var2.getClass();
        yq0VarArr[0].setVisibility(0);
        yq0VarArr[0].setScaleX(0.8f);
        yq0VarArr[0].setScaleY(0.8f);
        yq0VarArr[0].setAlpha(0.0f);
        yq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = yq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        qr qrVar = qr.h;
        org.telegram.messenger.wh.r(translationY, qrVar, 320L);
        yq0 yq0Var3 = yq0VarArr[1];
        yq0Var3.getClass();
        yq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(qrVar).setDuration(320L).withEndAction(new xq0(yq0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f22704c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f22704c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (yq0 yq0Var : this.f22702a) {
            yq0Var.f30650a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(zq0 zq0Var) {
        this.H = zq0Var;
    }
}
