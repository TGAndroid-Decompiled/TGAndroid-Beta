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
public final class er0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public br0 G;
    public dr0 H;
    public final cr0[] f26114a;
    public int f26115b;
    public int f26116c;
    public long d;
    public ArrayList f26117e;
    public final ArrayList f26118f;
    public boolean h;
    public boolean f26119n;
    public String f26120r;
    public final ArrayList f26121s;
    public final HashMap v;
    public TLRPC.WebPage f26122w;
    public int f26123x;
    public int f26124y;

    public er0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f26114a = new cr0[2];
        this.f26115b = 0;
        this.f26118f = new ArrayList();
        this.f26119n = true;
        this.f26121s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            cr0[] cr0VarArr = this.f26114a;
            if (i10 < cr0VarArr.length) {
                cr0VarArr[i10] = new cr0(this, activity, d6Var);
                addView(this.f26114a[i10], w7.z5.c(-1.0f, -1));
                i10++;
            } else {
                cr0VarArr[0].setVisibility(0);
                this.f26114a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(cr0 cr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = cr0Var.f25440b;
        w9 w9Var = cr0Var.f25444n;
        imageView.setImageResource(R.drawable.msg_link2);
        cr0Var.f25440b.setVisibility(0);
        cr0Var.f25443f.setVisibility(8);
        cr0Var.f25445r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        cr0Var.f25441c.l(str2, false);
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
        cr0Var.d.l(str3, false);
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
        cr0Var.f25439a.setClickable(false);
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

    public final String c(cr0 cr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f26118f;
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
                    shortName = DialogObject.getName(this.f26116c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f26116c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.i5 i5Var = cr0Var.d;
        if (i5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = i5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && i5Var.getPaint().measureText(formatString) <= f7) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f26123x != 0) {
            AccountInstance.getInstance(this.f26116c).getConnectionsManager().cancelRequest(this.f26123x, true);
            this.f26123x = 0;
        }
        this.f26124y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f26122w != null && i11 == this.f26116c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f20195id == this.f26122w.f20195id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f26122w = null;
                        d();
                        if (this.f26115b != 0) {
                            this.f26115b = 0;
                            dr0 dr0Var = this.H;
                            if (dr0Var != null) {
                                ((org.telegram.ui.xv) dr0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f26122w = webPage;
                        ArrayList arrayList = this.f26121s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f26114a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.er0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f26115b == 1 && (w9VarArr = this.f26114a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f26117e = null;
        this.h = true;
        this.f26119n = true;
        this.f26120r = null;
        this.f26122w = null;
        d();
        this.f26121s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f26122w;
    }

    public int getMode() {
        return this.f26115b;
    }

    public final void h(int i10) {
        if (this.f26116c == i10) {
            this.f26116c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f26116c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f26116c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f26116c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f26116c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        dr0 dr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f26117e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f26122w = null;
        d();
        this.f26121s.clear();
        int i12 = this.f26115b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26115b = 1;
        if (z10) {
            k();
        }
        cr0[] cr0VarArr = this.f26114a;
        cr0 cr0Var = cr0VarArr[0];
        ImageView imageView = cr0Var.f25440b;
        org.telegram.ui.ActionBar.i5 i5Var = cr0Var.d;
        w9[] w9VarArr = cr0Var.h;
        org.telegram.ui.ActionBar.i5 i5Var2 = cr0Var.f25441c;
        imageView.setImageResource(R.drawable.filled_forward);
        cr0Var.f25440b.setVisibility(0);
        cr0Var.f25444n.setVisibility(8);
        cr0Var.f25443f.setVisibility(0);
        cr0Var.f25445r.setVisibility(8);
        cr0Var.f25439a.setClickable(true);
        ArrayList arrayList2 = this.f26117e;
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
                i5Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                i5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                i5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                i5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            i5Var.l(c(cr0Var), false);
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
            i5Var2.l("", false);
            i5Var.l("", false);
            for (w9 w9Var4 : w9VarArr) {
                w9Var4.setVisibility(8);
            }
        }
        cr0 cr0Var2 = cr0VarArr[0];
        String str = this.F;
        if (str != null) {
            cr0Var2.f25442e.l(str, false);
        }
        int i16 = this.f26115b;
        if (i12 != i16 && (dr0Var = this.H) != null) {
            ((org.telegram.ui.xv) dr0Var).i(i16);
        }
    }

    public final void j() {
        cr0[] cr0VarArr;
        br0 br0Var = this.G;
        if (br0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(br0Var);
            this.G = null;
        }
        this.E = false;
        for (cr0 cr0Var : this.f26114a) {
            org.telegram.ui.ActionBar.i5 i5Var = cr0Var.d;
            i5Var.setAlpha(1.0f);
            i5Var.setScaleX(1.0f);
            i5Var.setScaleY(1.0f);
            cr0Var.f25442e.setAlpha(0.0f);
        }
    }

    public final void k() {
        cr0[] cr0VarArr = this.f26114a;
        cr0 cr0Var = cr0VarArr[0];
        cr0 cr0Var2 = cr0VarArr[1];
        cr0VarArr[0] = cr0Var2;
        cr0VarArr[1] = cr0Var;
        cr0Var2.getClass();
        cr0VarArr[0].setVisibility(0);
        cr0VarArr[0].setScaleX(0.8f);
        cr0VarArr[0].setScaleY(0.8f);
        cr0VarArr[0].setAlpha(0.0f);
        cr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = cr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        tr trVar = tr.h;
        org.telegram.messenger.bi.r(translationY, trVar, 320L);
        cr0 cr0Var3 = cr0VarArr[1];
        cr0Var3.getClass();
        cr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(trVar).setDuration(320L).withEndAction(new br0(cr0Var3, 1)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f26116c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f26116c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (cr0 cr0Var : this.f26114a) {
            cr0Var.f25439a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(dr0 dr0Var) {
        this.H = dr0Var;
    }
}
