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
public final class nr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public kr0 G;
    public mr0 H;
    public final lr0[] f29002a;
    public int f29003b;
    public int f29004c;
    public long d;
    public ArrayList e;
    public final ArrayList f29005f;
    public boolean h;
    public boolean f29006n;
    public String f29007r;
    public final ArrayList f29008s;
    public final HashMap v;
    public TLRPC.WebPage f29009w;
    public int f29010x;
    public int f29011y;

    public nr0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f29002a = new lr0[2];
        this.f29003b = 0;
        this.f29005f = new ArrayList();
        this.f29006n = true;
        this.f29008s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            lr0[] lr0VarArr = this.f29002a;
            if (i10 < lr0VarArr.length) {
                lr0VarArr[i10] = new lr0(this, activity, g6Var);
                addView(this.f29002a[i10], w7.z5.c(-1.0f, -1));
                i10++;
            } else {
                lr0VarArr[0].setVisibility(0);
                this.f29002a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(lr0 lr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = lr0Var.f28413b;
        w9 w9Var = lr0Var.f28416n;
        imageView.setImageResource(R.drawable.msg_link2);
        lr0Var.f28413b.setVisibility(0);
        lr0Var.f28415f.setVisibility(8);
        lr0Var.f28417r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        lr0Var.f28414c.l(str2, false);
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
        lr0Var.d.l(str3, false);
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
        lr0Var.f28412a.setClickable(false);
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
            w9Var.g(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                w9Var.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            w9Var.p(photoEntry.orientation, photoEntry.invert, true);
            w9Var.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            w9Var.setImageDrawable(null);
        }
    }

    public final String c(lr0 lr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f29005f;
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
                    shortName = DialogObject.getName(this.f29004c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f29004c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.n5 n5Var = lr0Var.d;
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
        if (this.f29010x != 0) {
            AccountInstance.getInstance(this.f29004c).getConnectionsManager().cancelRequest(this.f29010x, true);
            this.f29010x = 0;
        }
        this.f29011y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f29009w != null && i11 == this.f29004c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f20496id == this.f29009w.f20496id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f29009w = null;
                        d();
                        if (this.f29003b != 0) {
                            this.f29003b = 0;
                            mr0 mr0Var = this.H;
                            if (mr0Var != null) {
                                ((org.telegram.ui.jv) mr0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f29009w = webPage;
                        ArrayList arrayList = this.f29008s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f29002a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nr0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f29003b == 1 && (w9VarArr = this.f29002a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f29006n = true;
        this.f29007r = null;
        this.f29009w = null;
        d();
        this.f29008s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f29009w;
    }

    public int getMode() {
        return this.f29003b;
    }

    public final void h(int i10) {
        if (this.f29004c == i10) {
            this.f29004c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f29004c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f29004c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f29004c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f29004c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        mr0 mr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f29009w = null;
        d();
        this.f29008s.clear();
        int i12 = this.f29003b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29003b = 1;
        if (z10) {
            k();
        }
        lr0[] lr0VarArr = this.f29002a;
        lr0 lr0Var = lr0VarArr[0];
        ImageView imageView = lr0Var.f28413b;
        org.telegram.ui.ActionBar.n5 n5Var = lr0Var.d;
        w9[] w9VarArr = lr0Var.h;
        org.telegram.ui.ActionBar.n5 n5Var2 = lr0Var.f28414c;
        imageView.setImageResource(R.drawable.filled_forward);
        lr0Var.f28413b.setVisibility(0);
        lr0Var.f28416n.setVisibility(8);
        lr0Var.f28415f.setVisibility(0);
        lr0Var.f28417r.setVisibility(8);
        lr0Var.f28412a.setClickable(true);
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
            n5Var.l(c(lr0Var), false);
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
            n5Var2.l("", false);
            n5Var.l("", false);
            for (w9 w9Var4 : w9VarArr) {
                w9Var4.setVisibility(8);
            }
        }
        lr0 lr0Var2 = lr0VarArr[0];
        String str = this.F;
        if (str != null) {
            lr0Var2.e.l(str, false);
        }
        int i16 = this.f29003b;
        if (i12 != i16 && (mr0Var = this.H) != null) {
            ((org.telegram.ui.jv) mr0Var).h(i16);
        }
    }

    public final void j() {
        lr0[] lr0VarArr;
        kr0 kr0Var = this.G;
        if (kr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
            this.G = null;
        }
        this.E = false;
        for (lr0 lr0Var : this.f29002a) {
            org.telegram.ui.ActionBar.n5 n5Var = lr0Var.d;
            n5Var.setAlpha(1.0f);
            n5Var.setScaleX(1.0f);
            n5Var.setScaleY(1.0f);
            lr0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        lr0[] lr0VarArr = this.f29002a;
        lr0 lr0Var = lr0VarArr[0];
        lr0 lr0Var2 = lr0VarArr[1];
        lr0VarArr[0] = lr0Var2;
        lr0VarArr[1] = lr0Var;
        lr0Var2.getClass();
        lr0VarArr[0].setVisibility(0);
        lr0VarArr[0].setScaleX(0.8f);
        lr0VarArr[0].setScaleY(0.8f);
        lr0VarArr[0].setAlpha(0.0f);
        lr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = lr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        bs bsVar = bs.h;
        org.telegram.messenger.sl.t(translationY, bsVar, 320L);
        lr0 lr0Var3 = lr0VarArr[1];
        lr0Var3.getClass();
        lr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(bsVar).setDuration(320L).withEndAction(new kr0(lr0Var3, 1)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f29004c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f29004c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (lr0 lr0Var : this.f29002a) {
            lr0Var.f28412a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(mr0 mr0Var) {
        this.H = mr0Var;
    }
}
