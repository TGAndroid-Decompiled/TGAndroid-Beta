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
public final class kr0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public rc0 G;
    public jr0 H;
    public final ir0[] f27928a;
    public int f27929b;
    public int f27930c;
    public long d;
    public ArrayList e;
    public final ArrayList f27931f;
    public boolean h;
    public boolean f27932n;
    public String f27933r;
    public final ArrayList f27934s;
    public final HashMap v;
    public TLRPC.WebPage f27935w;
    public int f27936x;
    public int f27937y;

    public kr0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f27928a = new ir0[2];
        this.f27929b = 0;
        this.f27931f = new ArrayList();
        this.f27932n = true;
        this.f27934s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            ir0[] ir0VarArr = this.f27928a;
            if (i10 < ir0VarArr.length) {
                ir0VarArr[i10] = new ir0(this, activity, d6Var);
                addView(this.f27928a[i10], w7.z5.c(-1.0f, -1));
                i10++;
            } else {
                ir0VarArr[0].setVisibility(0);
                this.f27928a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(ir0 ir0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = ir0Var.f27331b;
        w9 w9Var = ir0Var.f27334n;
        imageView.setImageResource(R.drawable.msg_link2);
        ir0Var.f27331b.setVisibility(0);
        ir0Var.f27333f.setVisibility(8);
        ir0Var.f27335r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ir0Var.f27332c.l(str2, false);
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
        ir0Var.d.l(str3, false);
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
        ir0Var.f27330a.setClickable(false);
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

    public final String c(ir0 ir0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f27931f;
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
                    shortName = DialogObject.getName(this.f27930c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f27930c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = ir0Var.d;
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
        if (this.f27936x != 0) {
            AccountInstance.getInstance(this.f27930c).getConnectionsManager().cancelRequest(this.f27936x, true);
            this.f27936x = 0;
        }
        this.f27937y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f27935w != null && i11 == this.f27930c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f20432id == this.f27935w.f20432id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f27935w = null;
                        d();
                        if (this.f27929b != 0) {
                            this.f27929b = 0;
                            jr0 jr0Var = this.H;
                            if (jr0Var != null) {
                                ((org.telegram.ui.hv) jr0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f27935w = webPage;
                        ArrayList arrayList = this.f27934s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f27928a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kr0.e(java.lang.CharSequence, boolean):void");
    }

    public final w9 f(int i10) {
        w9[] w9VarArr;
        if (this.f27929b == 1 && (w9VarArr = this.f27928a[0].h) != null && i10 >= 0 && i10 < w9VarArr.length && w9VarArr[i10].getVisibility() == 0) {
            return w9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f27932n = true;
        this.f27933r = null;
        this.f27935w = null;
        d();
        this.f27934s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f27935w;
    }

    public int getMode() {
        return this.f27929b;
    }

    public final void h(int i10) {
        if (this.f27930c == i10) {
            this.f27930c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f27930c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f27930c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f27930c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f27930c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        jr0 jr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f27935w = null;
        d();
        this.f27934s.clear();
        int i12 = this.f27929b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27929b = 1;
        if (z10) {
            k();
        }
        ir0[] ir0VarArr = this.f27928a;
        ir0 ir0Var = ir0VarArr[0];
        ImageView imageView = ir0Var.f27331b;
        org.telegram.ui.ActionBar.j5 j5Var = ir0Var.d;
        w9[] w9VarArr = ir0Var.h;
        org.telegram.ui.ActionBar.j5 j5Var2 = ir0Var.f27332c;
        imageView.setImageResource(R.drawable.filled_forward);
        ir0Var.f27331b.setVisibility(0);
        ir0Var.f27334n.setVisibility(8);
        ir0Var.f27333f.setVisibility(0);
        ir0Var.f27335r.setVisibility(8);
        ir0Var.f27330a.setClickable(true);
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
            j5Var.l(c(ir0Var), false);
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
        ir0 ir0Var2 = ir0VarArr[0];
        String str = this.F;
        if (str != null) {
            ir0Var2.e.l(str, false);
        }
        int i16 = this.f27929b;
        if (i12 != i16 && (jr0Var = this.H) != null) {
            ((org.telegram.ui.hv) jr0Var).h(i16);
        }
    }

    public final void j() {
        ir0[] ir0VarArr;
        rc0 rc0Var = this.G;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
            this.G = null;
        }
        this.E = false;
        for (ir0 ir0Var : this.f27928a) {
            org.telegram.ui.ActionBar.j5 j5Var = ir0Var.d;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            ir0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        ir0[] ir0VarArr = this.f27928a;
        ir0 ir0Var = ir0VarArr[0];
        ir0 ir0Var2 = ir0VarArr[1];
        ir0VarArr[0] = ir0Var2;
        ir0VarArr[1] = ir0Var;
        ir0Var2.getClass();
        ir0VarArr[0].setVisibility(0);
        ir0VarArr[0].setScaleX(0.8f);
        ir0VarArr[0].setScaleY(0.8f);
        ir0VarArr[0].setAlpha(0.0f);
        ir0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = ir0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        bs bsVar = bs.h;
        org.telegram.messenger.ok.t(translationY, bsVar, 320L);
        ir0 ir0Var3 = ir0VarArr[1];
        ir0Var3.getClass();
        ir0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(bsVar).setDuration(320L).withEndAction(new hr0(ir0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f27930c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f27930c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (ir0 ir0Var : this.f27928a) {
            ir0Var.f27330a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(jr0 jr0Var) {
        this.H = jr0Var;
    }
}
