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
public final class iq0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int E = 0;
    public boolean A;
    public String B;
    public xb0 C;
    public hq0 D;
    public final gq0[] f29442a;
    public int f29443b;
    public int f29444c;
    public long d;
    public ArrayList f29445e;
    public final ArrayList f29446f;
    public boolean h;
    public boolean f29447n;
    public String f29448r;
    public final ArrayList f29449s;
    public final HashMap v;
    public TLRPC.WebPage f29450w;
    public int f29451x;
    public int f29452y;

    public iq0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f29442a = new gq0[2];
        this.f29443b = 0;
        this.f29446f = new ArrayList();
        this.f29447n = true;
        this.f29449s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            gq0[] gq0VarArr = this.f29442a;
            if (i10 < gq0VarArr.length) {
                gq0VarArr[i10] = new gq0(this, activity, c6Var);
                addView(this.f29442a[i10], i7.f6.c(-1.0f, -1));
                i10++;
            } else {
                gq0VarArr[0].setVisibility(0);
                this.f29442a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(gq0 gq0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = gq0Var.f28958b;
        t9 t9Var = gq0Var.f28962n;
        imageView.setImageResource(R.drawable.msg_link2);
        gq0Var.f28958b.setVisibility(0);
        gq0Var.f28961f.setVisibility(8);
        gq0Var.f28963r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        gq0Var.f28959c.l(str2, false);
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
        gq0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                t9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                t9Var.setVisibility(0);
            } else {
                t9Var.setVisibility(8);
            }
        } else {
            t9Var.setVisibility(8);
        }
        gq0Var.f28957a.setClickable(false);
    }

    public static void b(t9 t9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            t9Var.setVisibility(8);
            return;
        }
        t9Var.setVisibility(0);
        t9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            t9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                t9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            t9Var.p(photoEntry.orientation, photoEntry.invert, true);
            t9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            t9Var.setImageDrawable(null);
        }
    }

    public final String c(gq0 gq0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f29446f;
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
                    shortName = DialogObject.getName(this.f29444c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f29444c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = gq0Var.d;
        if (h5Var.getMeasuredWidth() <= 0) {
            measuredWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f);
        } else {
            measuredWidth = h5Var.getMeasuredWidth();
        }
        float f9 = measuredWidth;
        if (arrayList.size() <= 2 && h5Var.getPaint().measureText(formatString) <= f9) {
            return formatString;
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public final void d() {
        if (this.f29451x != 0) {
            AccountInstance.getInstance(this.f29444c).getConnectionsManager().cancelRequest(this.f29451x, true);
            this.f29451x = 0;
        }
        this.f29452y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f29450w != null && i11 == this.f29444c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f22545id == this.f29450w.f22545id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f29450w = null;
                        d();
                        if (this.f29443b != 0) {
                            this.f29443b = 0;
                            hq0 hq0Var = this.D;
                            if (hq0Var != null) {
                                ((org.telegram.ui.kv) hq0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f29450w = webPage;
                        ArrayList arrayList = this.f29449s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f29442a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iq0.e(java.lang.CharSequence, boolean):void");
    }

    public final t9 f(int i10) {
        t9[] t9VarArr;
        if (this.f29443b == 1 && (t9VarArr = this.f29442a[0].h) != null && i10 >= 0 && i10 < t9VarArr.length && t9VarArr[i10].getVisibility() == 0) {
            return t9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f29445e = null;
        this.h = true;
        this.f29447n = true;
        this.f29448r = null;
        this.f29450w = null;
        d();
        this.f29449s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f29450w;
    }

    public int getMode() {
        return this.f29443b;
    }

    public final void h(int i10) {
        if (this.f29444c == i10) {
            this.f29444c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f29444c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f29444c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f29444c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f29444c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        hq0 hq0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f29445e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f29450w = null;
        d();
        this.f29449s.clear();
        int i12 = this.f29443b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29443b = 1;
        if (z10) {
            k();
        }
        gq0[] gq0VarArr = this.f29442a;
        gq0 gq0Var = gq0VarArr[0];
        ImageView imageView = gq0Var.f28958b;
        org.telegram.ui.ActionBar.h5 h5Var = gq0Var.d;
        t9[] t9VarArr = gq0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = gq0Var.f28959c;
        imageView.setImageResource(R.drawable.filled_forward);
        gq0Var.f28958b.setVisibility(0);
        gq0Var.f28962n.setVisibility(8);
        gq0Var.f28961f.setVisibility(0);
        gq0Var.f28963r.setVisibility(8);
        gq0Var.f28957a.setClickable(true);
        ArrayList arrayList2 = this.f29445e;
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
            h5Var.l(c(gq0Var), false);
            t9 t9Var = t9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(t9Var, photoEntry);
            t9 t9Var2 = t9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(t9Var2, photoEntry2);
            t9 t9Var3 = t9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(t9Var3, photoEntry3);
        } else {
            h5Var2.l("", false);
            h5Var.l("", false);
            for (t9 t9Var4 : t9VarArr) {
                t9Var4.setVisibility(8);
            }
        }
        gq0 gq0Var2 = gq0VarArr[0];
        String str = this.B;
        if (str != null) {
            gq0Var2.f28960e.l(str, false);
        }
        int i16 = this.f29443b;
        if (i12 != i16 && (hq0Var = this.D) != null) {
            ((org.telegram.ui.kv) hq0Var).h(i16);
        }
    }

    public final void j() {
        gq0[] gq0VarArr;
        xb0 xb0Var = this.C;
        if (xb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xb0Var);
            this.C = null;
        }
        this.A = false;
        for (gq0 gq0Var : this.f29442a) {
            org.telegram.ui.ActionBar.h5 h5Var = gq0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            gq0Var.f28960e.setAlpha(0.0f);
        }
    }

    public final void k() {
        gq0[] gq0VarArr = this.f29442a;
        gq0 gq0Var = gq0VarArr[0];
        gq0 gq0Var2 = gq0VarArr[1];
        gq0VarArr[0] = gq0Var2;
        gq0VarArr[1] = gq0Var;
        gq0Var2.getClass();
        gq0VarArr[0].setVisibility(0);
        gq0VarArr[0].setScaleX(0.8f);
        gq0VarArr[0].setScaleY(0.8f);
        gq0VarArr[0].setAlpha(0.0f);
        gq0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = gq0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        jr jrVar = jr.h;
        org.telegram.ui.b.q(translationY, jrVar, 320L);
        gq0 gq0Var3 = gq0VarArr[1];
        gq0Var3.getClass();
        gq0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(jrVar).setDuration(320L).withEndAction(new fq0(gq0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f29444c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f29444c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (gq0 gq0Var : this.f29442a) {
            gq0Var.f28957a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(hq0 hq0Var) {
        this.D = hq0Var;
    }
}
