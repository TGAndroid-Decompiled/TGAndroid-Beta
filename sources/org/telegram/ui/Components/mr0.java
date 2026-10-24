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
public final class mr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public jr0 G;
    public lr0 H;
    public final kr0[] f28677a;
    public int f28678b;
    public int f28679c;
    public long d;
    public ArrayList e;
    public final ArrayList f28680f;
    public boolean h;
    public boolean f28681n;
    public String f28682r;
    public final ArrayList f28683s;
    public final HashMap v;
    public TLRPC.WebPage f28684w;
    public int f28685x;
    public int f28686y;

    public mr0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f28677a = new kr0[2];
        this.f28678b = 0;
        this.f28680f = new ArrayList();
        this.f28681n = true;
        this.f28683s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            kr0[] kr0VarArr = this.f28677a;
            if (i10 < kr0VarArr.length) {
                kr0VarArr[i10] = new kr0(this, activity, g6Var);
                addView(this.f28677a[i10], w7.z5.c(-1.0f, -1));
                i10++;
            } else {
                kr0VarArr[0].setVisibility(0);
                this.f28677a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(kr0 kr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = kr0Var.f28075b;
        u9 u9Var = kr0Var.f28078n;
        imageView.setImageResource(R.drawable.msg_link2);
        kr0Var.f28075b.setVisibility(0);
        kr0Var.f28077f.setVisibility(8);
        kr0Var.f28079r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        kr0Var.f28076c.l(str2, false);
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
        kr0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                u9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                u9Var.setVisibility(0);
            } else {
                u9Var.setVisibility(8);
            }
        } else {
            u9Var.setVisibility(8);
        }
        kr0Var.f28074a.setClickable(false);
    }

    public static void b(u9 u9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            u9Var.setVisibility(8);
            return;
        }
        u9Var.setVisibility(0);
        u9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            u9Var.g(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                u9Var.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            u9Var.p(photoEntry.orientation, photoEntry.invert, true);
            u9Var.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            u9Var.setImageDrawable(null);
        }
    }

    public final String c(kr0 kr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f28680f;
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
                    shortName = DialogObject.getName(this.f28679c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f28679c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.n5 n5Var = kr0Var.d;
        if (n5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = n5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && n5Var.getPaint().measureText(formatString) <= f7) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f28685x != 0) {
            AccountInstance.getInstance(this.f28679c).getConnectionsManager().cancelRequest(this.f28685x, true);
            this.f28685x = 0;
        }
        this.f28686y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f28684w != null && i11 == this.f28679c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f20497id == this.f28684w.f20497id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f28684w = null;
                        d();
                        if (this.f28678b != 0) {
                            this.f28678b = 0;
                            lr0 lr0Var = this.H;
                            if (lr0Var != null) {
                                ((org.telegram.ui.jv) lr0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f28684w = webPage;
                        ArrayList arrayList = this.f28683s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f28677a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mr0.e(java.lang.CharSequence, boolean):void");
    }

    public final u9 f(int i10) {
        u9[] u9VarArr;
        if (this.f28678b == 1 && (u9VarArr = this.f28677a[0].h) != null && i10 >= 0 && i10 < u9VarArr.length && u9VarArr[i10].getVisibility() == 0) {
            return u9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f28681n = true;
        this.f28682r = null;
        this.f28684w = null;
        d();
        this.f28683s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f28684w;
    }

    public int getMode() {
        return this.f28678b;
    }

    public final void h(int i10) {
        if (this.f28679c == i10) {
            this.f28679c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f28679c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f28679c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f28679c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f28679c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        lr0 lr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f28684w = null;
        d();
        this.f28683s.clear();
        int i12 = this.f28678b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28678b = 1;
        if (z10) {
            k();
        }
        kr0[] kr0VarArr = this.f28677a;
        kr0 kr0Var = kr0VarArr[0];
        ImageView imageView = kr0Var.f28075b;
        org.telegram.ui.ActionBar.n5 n5Var = kr0Var.d;
        u9[] u9VarArr = kr0Var.h;
        org.telegram.ui.ActionBar.n5 n5Var2 = kr0Var.f28076c;
        imageView.setImageResource(R.drawable.filled_forward);
        kr0Var.f28075b.setVisibility(0);
        kr0Var.f28078n.setVisibility(8);
        kr0Var.f28077f.setVisibility(0);
        kr0Var.f28079r.setVisibility(8);
        kr0Var.f28074a.setClickable(true);
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
                n5Var2.l(LocaleController.getString(i11), false);
            } else if (i13 == 0) {
                n5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i14 == 0) {
                n5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                n5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            n5Var.l(c(kr0Var), false);
            u9 u9Var = u9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(u9Var, photoEntry);
            u9 u9Var2 = u9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(u9Var2, photoEntry2);
            u9 u9Var3 = u9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(u9Var3, photoEntry3);
        } else {
            n5Var2.l("", false);
            n5Var.l("", false);
            for (u9 u9Var4 : u9VarArr) {
                u9Var4.setVisibility(8);
            }
        }
        kr0 kr0Var2 = kr0VarArr[0];
        String str = this.F;
        if (str != null) {
            kr0Var2.e.l(str, false);
        }
        int i16 = this.f28678b;
        if (i12 != i16 && (lr0Var = this.H) != null) {
            ((org.telegram.ui.jv) lr0Var).h(i16);
        }
    }

    public final void j() {
        kr0[] kr0VarArr;
        jr0 jr0Var = this.G;
        if (jr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jr0Var);
            this.G = null;
        }
        this.E = false;
        for (kr0 kr0Var : this.f28677a) {
            org.telegram.ui.ActionBar.n5 n5Var = kr0Var.d;
            n5Var.setAlpha(1.0f);
            n5Var.setScaleX(1.0f);
            n5Var.setScaleY(1.0f);
            kr0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        kr0[] kr0VarArr = this.f28677a;
        kr0 kr0Var = kr0VarArr[0];
        kr0 kr0Var2 = kr0VarArr[1];
        kr0VarArr[0] = kr0Var2;
        kr0VarArr[1] = kr0Var;
        kr0Var2.getClass();
        kr0VarArr[0].setVisibility(0);
        kr0VarArr[0].setScaleX(0.8f);
        kr0VarArr[0].setScaleY(0.8f);
        kr0VarArr[0].setAlpha(0.0f);
        kr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = kr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        zr zrVar = zr.h;
        org.telegram.messenger.tl.t(translationY, zrVar, 320L);
        kr0 kr0Var3 = kr0VarArr[1];
        kr0Var3.getClass();
        kr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(zrVar).setDuration(320L).withEndAction(new jr0(kr0Var3, 1)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f28679c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28679c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (kr0 kr0Var : this.f28677a) {
            kr0Var.f28074a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(lr0 lr0Var) {
        this.H = lr0Var;
    }
}
