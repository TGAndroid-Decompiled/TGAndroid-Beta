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
    public jc0 G;
    public yq0 H;
    public final xq0[] f30901a;
    public int f30902b;
    public int f30903c;
    public long d;
    public ArrayList e;
    public final ArrayList f30904f;
    public boolean h;
    public boolean f30905n;
    public String f30906r;
    public final ArrayList f30907s;
    public final HashMap v;
    public TLRPC.WebPage f30908w;
    public int f30909x;
    public int f30910y;

    public zq0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f30901a = new xq0[2];
        this.f30902b = 0;
        this.f30904f = new ArrayList();
        this.f30905n = true;
        this.f30907s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            xq0[] xq0VarArr = this.f30901a;
            if (i10 < xq0VarArr.length) {
                xq0VarArr[i10] = new xq0(this, activity, f6Var);
                addView(this.f30901a[i10], w7.y5.c(-1.0f, -1));
                i10++;
            } else {
                xq0VarArr[0].setVisibility(0);
                this.f30901a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(xq0 xq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = xq0Var.f30347b;
        v9 v9Var = xq0Var.f30350n;
        imageView.setImageResource(R.drawable.msg_link2);
        xq0Var.f30347b.setVisibility(0);
        xq0Var.f30349f.setVisibility(8);
        xq0Var.f30351r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        xq0Var.f30348c.l(str2, false);
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
                v9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                v9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                v9Var.setVisibility(0);
            } else {
                v9Var.setVisibility(8);
            }
        } else {
            v9Var.setVisibility(8);
        }
        xq0Var.f30346a.setClickable(false);
    }

    public static void b(v9 v9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            v9Var.setVisibility(8);
            return;
        }
        v9Var.setVisibility(0);
        v9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            v9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                v9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            v9Var.p(photoEntry.orientation, photoEntry.invert, true);
            v9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            v9Var.setImageDrawable(null);
        }
    }

    public final String c(xq0 xq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f30904f;
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
                    shortName = DialogObject.getName(this.f30903c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f30903c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = xq0Var.d;
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
        if (this.f30909x != 0) {
            AccountInstance.getInstance(this.f30903c).getConnectionsManager().cancelRequest(this.f30909x, true);
            this.f30909x = 0;
        }
        this.f30910y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f30908w != null && i11 == this.f30903c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f18481id == this.f30908w.f18481id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f30908w = null;
                        d();
                        if (this.f30902b != 0) {
                            this.f30902b = 0;
                            yq0 yq0Var = this.H;
                            if (yq0Var != null) {
                                ((org.telegram.ui.xv) yq0Var).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f30908w = webPage;
                        ArrayList arrayList = this.f30907s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f30901a[0], webPage, str);
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

    public final v9 f(int i10) {
        v9[] v9VarArr;
        if (this.f30902b == 1 && (v9VarArr = this.f30901a[0].h) != null && i10 >= 0 && i10 < v9VarArr.length && v9VarArr[i10].getVisibility() == 0) {
            return v9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f30905n = true;
        this.f30906r = null;
        this.f30908w = null;
        d();
        this.f30907s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f30908w;
    }

    public int getMode() {
        return this.f30902b;
    }

    public final void h(int i10) {
        if (this.f30903c == i10) {
            this.f30903c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f30903c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30903c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f30903c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f30903c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
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
        this.f30908w = null;
        d();
        this.f30907s.clear();
        int i12 = this.f30902b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30902b = 1;
        if (z10) {
            k();
        }
        xq0[] xq0VarArr = this.f30901a;
        xq0 xq0Var = xq0VarArr[0];
        ImageView imageView = xq0Var.f30347b;
        org.telegram.ui.ActionBar.j5 j5Var = xq0Var.d;
        v9[] v9VarArr = xq0Var.h;
        org.telegram.ui.ActionBar.j5 j5Var2 = xq0Var.f30348c;
        imageView.setImageResource(R.drawable.filled_forward);
        xq0Var.f30347b.setVisibility(0);
        xq0Var.f30350n.setVisibility(8);
        xq0Var.f30349f.setVisibility(0);
        xq0Var.f30351r.setVisibility(8);
        xq0Var.f30346a.setClickable(true);
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
            j5Var.l(c(xq0Var), false);
            v9 v9Var = v9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(v9Var, photoEntry);
            v9 v9Var2 = v9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(v9Var2, photoEntry2);
            v9 v9Var3 = v9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(v9Var3, photoEntry3);
        } else {
            j5Var2.l("", false);
            j5Var.l("", false);
            for (v9 v9Var4 : v9VarArr) {
                v9Var4.setVisibility(8);
            }
        }
        xq0 xq0Var2 = xq0VarArr[0];
        String str = this.F;
        if (str != null) {
            xq0Var2.e.l(str, false);
        }
        int i16 = this.f30902b;
        if (i12 != i16 && (yq0Var = this.H) != null) {
            ((org.telegram.ui.xv) yq0Var).g(i16);
        }
    }

    public final void j() {
        xq0[] xq0VarArr;
        jc0 jc0Var = this.G;
        if (jc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jc0Var);
            this.G = null;
        }
        this.E = false;
        for (xq0 xq0Var : this.f30901a) {
            org.telegram.ui.ActionBar.j5 j5Var = xq0Var.d;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            xq0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        xq0[] xq0VarArr = this.f30901a;
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
        qr qrVar = qr.h;
        org.telegram.messenger.rk.s(translationY, qrVar, 320L);
        xq0 xq0Var3 = xq0VarArr[1];
        xq0Var3.getClass();
        xq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(qrVar).setDuration(320L).withEndAction(new wq0(xq0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f30903c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f30903c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (xq0 xq0Var : this.f30901a) {
            xq0Var.f30346a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(yq0 yq0Var) {
        this.H = yq0Var;
    }
}
