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
public final class cr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public zq0 G;
    public br0 H;
    public final ar0[] f23405a;
    public int f23406b;
    public int f23407c;
    public long d;
    public ArrayList e;
    public final ArrayList f23408f;
    public boolean h;
    public boolean f23409n;
    public String f23410r;
    public final ArrayList f23411s;
    public final HashMap v;
    public TLRPC.WebPage f23412w;
    public int f23413x;
    public int f23414y;

    public cr0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f23405a = new ar0[2];
        this.f23406b = 0;
        this.f23408f = new ArrayList();
        this.f23409n = true;
        this.f23411s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            ar0[] ar0VarArr = this.f23405a;
            if (i10 < ar0VarArr.length) {
                ar0VarArr[i10] = new ar0(this, activity, d6Var);
                addView(this.f23405a[i10], w7.y5.c(-1.0f, -1));
                i10++;
            } else {
                ar0VarArr[0].setVisibility(0);
                this.f23405a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(ar0 ar0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = ar0Var.f22700b;
        w9 w9Var = ar0Var.f22703n;
        imageView.setImageResource(R.drawable.msg_link2);
        ar0Var.f22700b.setVisibility(0);
        ar0Var.f22702f.setVisibility(8);
        ar0Var.f22704r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ar0Var.f22701c.l(str2, false);
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
        ar0Var.d.l(str3, false);
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
        ar0Var.f22699a.setClickable(false);
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

    public final String c(ar0 ar0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f23408f;
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
                    shortName = DialogObject.getName(this.f23407c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f23407c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = ar0Var.d;
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
        if (this.f23413x != 0) {
            AccountInstance.getInstance(this.f23407c).getConnectionsManager().cancelRequest(this.f23413x, true);
            this.f23413x = 0;
        }
        this.f23414y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f23412w != null && i11 == this.f23407c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f18505id == this.f23412w.f18505id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f23412w = null;
                        d();
                        if (this.f23406b != 0) {
                            this.f23406b = 0;
                            br0 br0Var = this.H;
                            if (br0Var != null) {
                                ((org.telegram.ui.sv) br0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f23412w = webPage;
                        ArrayList arrayList = this.f23411s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f23405a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cr0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f23406b == 1 && (w9VarArr = this.f23405a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f23409n = true;
        this.f23410r = null;
        this.f23412w = null;
        d();
        this.f23411s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f23412w;
    }

    public int getMode() {
        return this.f23406b;
    }

    public final void h(int i10) {
        if (this.f23407c == i10) {
            this.f23407c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f23407c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f23407c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f23407c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f23407c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        br0 br0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f23412w = null;
        d();
        this.f23411s.clear();
        int i12 = this.f23406b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23406b = 1;
        if (z10) {
            k();
        }
        ar0[] ar0VarArr = this.f23405a;
        ar0 ar0Var = ar0VarArr[0];
        ImageView imageView = ar0Var.f22700b;
        org.telegram.ui.ActionBar.h5 h5Var = ar0Var.d;
        w9[] w9VarArr = ar0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = ar0Var.f22701c;
        imageView.setImageResource(R.drawable.filled_forward);
        ar0Var.f22700b.setVisibility(0);
        ar0Var.f22703n.setVisibility(8);
        ar0Var.f22702f.setVisibility(0);
        ar0Var.f22704r.setVisibility(8);
        ar0Var.f22699a.setClickable(true);
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
            h5Var.l(c(ar0Var), false);
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
        ar0 ar0Var2 = ar0VarArr[0];
        String str = this.F;
        if (str != null) {
            ar0Var2.e.l(str, false);
        }
        int i16 = this.f23406b;
        if (i12 != i16 && (br0Var = this.H) != null) {
            ((org.telegram.ui.sv) br0Var).h(i16);
        }
    }

    public final void j() {
        ar0[] ar0VarArr;
        zq0 zq0Var = this.G;
        if (zq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zq0Var);
            this.G = null;
        }
        this.E = false;
        for (ar0 ar0Var : this.f23405a) {
            org.telegram.ui.ActionBar.h5 h5Var = ar0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            ar0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        ar0[] ar0VarArr = this.f23405a;
        ar0 ar0Var = ar0VarArr[0];
        ar0 ar0Var2 = ar0VarArr[1];
        ar0VarArr[0] = ar0Var2;
        ar0VarArr[1] = ar0Var;
        ar0Var2.getClass();
        ar0VarArr[0].setVisibility(0);
        ar0VarArr[0].setScaleX(0.8f);
        ar0VarArr[0].setScaleY(0.8f);
        ar0VarArr[0].setAlpha(0.0f);
        ar0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = ar0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        tr trVar = tr.h;
        org.telegram.messenger.ok.s(translationY, trVar, 320L);
        ar0 ar0Var3 = ar0VarArr[1];
        ar0Var3.getClass();
        ar0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(trVar).setDuration(320L).withEndAction(new zq0(ar0Var3, 1)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f23407c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f23407c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (ar0 ar0Var : this.f23405a) {
            ar0Var.f22699a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(br0 br0Var) {
        this.H = br0Var;
    }
}
