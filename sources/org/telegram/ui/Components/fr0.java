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
public final class fr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public gq0 G;
    public er0 H;
    public final dr0[] f26566a;
    public int f26567b;
    public int f26568c;
    public long d;
    public ArrayList f26569e;
    public final ArrayList f26570f;
    public boolean h;
    public boolean f26571n;
    public String f26572r;
    public final ArrayList f26573s;
    public final HashMap v;
    public TLRPC.WebPage f26574w;
    public int f26575x;
    public int f26576y;

    public fr0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f26566a = new dr0[2];
        this.f26567b = 0;
        this.f26570f = new ArrayList();
        this.f26571n = true;
        this.f26573s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            dr0[] dr0VarArr = this.f26566a;
            if (i10 < dr0VarArr.length) {
                dr0VarArr[i10] = new dr0(this, activity, d6Var);
                addView(this.f26566a[i10], w7.z5.c(-1.0f, -1));
                i10++;
            } else {
                dr0VarArr[0].setVisibility(0);
                this.f26566a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(dr0 dr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = dr0Var.f25850b;
        w9 w9Var = dr0Var.f25854n;
        imageView.setImageResource(R.drawable.msg_link2);
        dr0Var.f25850b.setVisibility(0);
        dr0Var.f25853f.setVisibility(8);
        dr0Var.f25855r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        dr0Var.f25851c.l(str2, false);
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
        dr0Var.d.l(str3, false);
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
        dr0Var.f25849a.setClickable(false);
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

    public final String c(dr0 dr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f26570f;
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
                    shortName = DialogObject.getName(this.f26568c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f26568c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.i5 i5Var = dr0Var.d;
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
        if (this.f26575x != 0) {
            AccountInstance.getInstance(this.f26568c).getConnectionsManager().cancelRequest(this.f26575x, true);
            this.f26575x = 0;
        }
        this.f26576y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f26574w != null && i11 == this.f26568c) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && webPage.f20200id == this.f26574w.f20200id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f26574w = null;
                        d();
                        if (this.f26567b != 0) {
                            this.f26567b = 0;
                            er0 er0Var = this.H;
                            if (er0Var != null) {
                                ((org.telegram.ui.xv) er0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f26574w = webPage;
                        ArrayList arrayList = this.f26573s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f26566a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fr0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f26567b == 1 && (w9VarArr = this.f26566a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f26569e = null;
        this.h = true;
        this.f26571n = true;
        this.f26572r = null;
        this.f26574w = null;
        d();
        this.f26573s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f26574w;
    }

    public int getMode() {
        return this.f26567b;
    }

    public final void h(int i10) {
        if (this.f26568c == i10) {
            this.f26568c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f26568c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f26568c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f26568c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f26568c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        er0 er0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f26569e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f26574w = null;
        d();
        this.f26573s.clear();
        int i12 = this.f26567b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26567b = 1;
        if (z10) {
            k();
        }
        dr0[] dr0VarArr = this.f26566a;
        dr0 dr0Var = dr0VarArr[0];
        ImageView imageView = dr0Var.f25850b;
        org.telegram.ui.ActionBar.i5 i5Var = dr0Var.d;
        w9[] w9VarArr = dr0Var.h;
        org.telegram.ui.ActionBar.i5 i5Var2 = dr0Var.f25851c;
        imageView.setImageResource(R.drawable.filled_forward);
        dr0Var.f25850b.setVisibility(0);
        dr0Var.f25854n.setVisibility(8);
        dr0Var.f25853f.setVisibility(0);
        dr0Var.f25855r.setVisibility(8);
        dr0Var.f25849a.setClickable(true);
        ArrayList arrayList2 = this.f26569e;
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
            i5Var.l(c(dr0Var), false);
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
        dr0 dr0Var2 = dr0VarArr[0];
        String str = this.F;
        if (str != null) {
            dr0Var2.f25852e.l(str, false);
        }
        int i16 = this.f26567b;
        if (i12 != i16 && (er0Var = this.H) != null) {
            ((org.telegram.ui.xv) er0Var).i(i16);
        }
    }

    public final void j() {
        dr0[] dr0VarArr;
        gq0 gq0Var = this.G;
        if (gq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
            this.G = null;
        }
        this.E = false;
        for (dr0 dr0Var : this.f26566a) {
            org.telegram.ui.ActionBar.i5 i5Var = dr0Var.d;
            i5Var.setAlpha(1.0f);
            i5Var.setScaleX(1.0f);
            i5Var.setScaleY(1.0f);
            dr0Var.f25852e.setAlpha(0.0f);
        }
    }

    public final void k() {
        dr0[] dr0VarArr = this.f26566a;
        dr0 dr0Var = dr0VarArr[0];
        dr0 dr0Var2 = dr0VarArr[1];
        dr0VarArr[0] = dr0Var2;
        dr0VarArr[1] = dr0Var;
        dr0Var2.getClass();
        dr0VarArr[0].setVisibility(0);
        dr0VarArr[0].setScaleX(0.8f);
        dr0VarArr[0].setScaleY(0.8f);
        dr0VarArr[0].setAlpha(0.0f);
        dr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = dr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        tr trVar = tr.h;
        org.telegram.messenger.bi.r(translationY, trVar, 320L);
        dr0 dr0Var3 = dr0VarArr[1];
        dr0Var3.getClass();
        dr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(trVar).setDuration(320L).withEndAction(new gq0(dr0Var3, 2)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f26568c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f26568c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (dr0 dr0Var : this.f26566a) {
            dr0Var.f25849a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(er0 er0Var) {
        this.H = er0Var;
    }
}
