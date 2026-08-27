package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
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
import org.telegram.tgnet.tl.TL_account;

public final class xp0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int E = 0;
    public boolean A;
    public String B;
    public mb0 C;
    public wp0 D;

    public final vp0[] f34667a;

    public int f34668b;

    public int f34669c;
    public long d;

    public ArrayList f34670e;

    public final ArrayList f34671f;
    public boolean h;

    public boolean f34672n;

    public String f34673r;

    public final ArrayList f34674s;
    public final HashMap v;

    public TLRPC.WebPage f34675w;

    public int f34676x;

    public int f34677y;

    public xp0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f34667a = new vp0[2];
        this.f34668b = 0;
        this.f34671f = new ArrayList();
        this.f34672n = true;
        this.f34674s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            vp0[] vp0VarArr = this.f34667a;
            if (i10 >= vp0VarArr.length) {
                vp0VarArr[0].setVisibility(0);
                this.f34667a[1].setVisibility(8);
                return;
            } else {
                vp0VarArr[i10] = new vp0(this, activity, c6Var);
                addView(this.f34667a[i10], h7.z5.c(-1.0f, -1));
                i10++;
            }
        }
    }

    public static void a(vp0 vp0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = vp0Var.f34024b;
        n9 n9Var = vp0Var.f34028n;
        imageView.setImageResource(R.drawable.msg_link2);
        vp0Var.f34024b.setVisibility(0);
        vp0Var.f34027f.setVisibility(8);
        vp0Var.f34029r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        vp0Var.f34025c.l(str2, false);
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
        vp0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                n9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                n9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                n9Var.setVisibility(0);
            } else {
                n9Var.setVisibility(8);
            }
        } else {
            n9Var.setVisibility(8);
        }
        vp0Var.f34023a.setClickable(false);
    }

    public static void b(n9 n9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            n9Var.setVisibility(8);
            return;
        }
        n9Var.setVisibility(0);
        n9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            n9Var.f(str, null, null);
            return;
        }
        if (photoEntry.path == null) {
            n9Var.setImageDrawable(null);
            return;
        }
        if (photoEntry.isVideo) {
            n9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
            return;
        }
        n9Var.p(photoEntry.orientation, photoEntry.invert, true);
        n9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
    }

    public final String c(vp0 vp0Var) {
        ArrayList arrayList = this.f34671f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long jLongValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (jLongValue == this.d) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(this.f34669c, jLongValue) : DialogObject.getShortName(this.f34669c, jLongValue));
            }
        }
        String string = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = vp0Var.d;
        return (arrayList.size() > 2 || h5Var.getPaint().measureText(string) > ((float) (h5Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x - AndroidUtilities.dp(140.0f) : h5Var.getMeasuredWidth()))) ? LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]) : string;
    }

    public final void d() {
        if (this.f34676x != 0) {
            AccountInstance.getInstance(this.f34669c).getConnectionsManager().cancelRequest(this.f34676x, true);
            this.f34676x = 0;
        }
        this.f34677y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f34675w != null && i11 == this.f34669c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f22533id == this.f34675w.f22533id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f34675w = null;
                        d();
                        if (this.f34668b != 0) {
                            this.f34668b = 0;
                            wp0 wp0Var = this.D;
                            if (wp0Var != null) {
                                ((org.telegram.ui.mv) wp0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (webPage instanceof TLRPC.TL_webPage) {
                        this.f34675w = webPage;
                        ArrayList arrayList = this.f34674s;
                        String string = arrayList.isEmpty() ? "" : TextUtils.join(" ", arrayList).toString();
                        HashMap map = this.v;
                        if (!map.containsKey(string)) {
                            map.put(string, webPage);
                        }
                        a(this.f34667a[0], webPage, string);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        ArrayList arrayList;
        wp0 wp0Var;
        boolean zIsEmpty;
        if (charSequence == null || charSequence.length() == 0) {
            arrayList = null;
        } else {
            try {
                Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence);
                arrayList = null;
                while (matcher.find()) {
                    try {
                        if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                arrayList = null;
            }
        }
        ArrayList arrayList2 = this.f34674s;
        if (!z10) {
            if (arrayList != null) {
                if (arrayList.size() == arrayList2.size()) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            zIsEmpty = true;
                            break;
                        } else {
                            if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
                                zIsEmpty = false;
                                break;
                            }
                            i10++;
                        }
                    }
                } else {
                    zIsEmpty = false;
                    break;
                }
            } else {
                zIsEmpty = arrayList2.isEmpty();
            }
            if (zIsEmpty) {
                return;
            }
        }
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            d();
            this.f34675w = null;
            if (this.f34668b != 0) {
                this.f34668b = 0;
                wp0 wp0Var2 = this.D;
                if (wp0Var2 != null) {
                    ((org.telegram.ui.mv) wp0Var2).h(0);
                    return;
                }
                return;
            }
            return;
        }
        String string = TextUtils.join(" ", arrayList).toString();
        if (!this.f34672n) {
            String str = this.f34673r;
            if (str != null && str.equals(string)) {
                return;
            }
            this.f34672n = true;
            this.f34673r = null;
        }
        int i11 = this.f34668b;
        boolean z11 = (i11 == 2 || i11 == 0) ? false : true;
        if (i11 != 2) {
            this.f34668b = 2;
        }
        if (z11) {
            k();
        }
        TLRPC.WebPage webPage = (TLRPC.WebPage) this.v.get(string);
        vp0[] vp0VarArr = this.f34667a;
        if (webPage != null) {
            this.f34675w = webPage;
            a(vp0VarArr[0], webPage, string);
        } else {
            vp0 vp0Var = vp0VarArr[0];
            vp0Var.f34024b.setImageResource(R.drawable.msg_link2);
            vp0Var.f34024b.setVisibility(0);
            vp0Var.f34027f.setVisibility(8);
            vp0Var.f34028n.setVisibility(8);
            vp0Var.f34029r.setVisibility(0);
            vp0Var.f34025c.l(LocaleController.getString(R.string.GettingLinkInfo), false);
            vp0Var.d.l(string == null ? "" : string, false);
            vp0Var.f34023a.setClickable(false);
            d();
            if (string != null && !string.isEmpty()) {
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = string;
                int i12 = this.f34677y + 1;
                this.f34677y = i12;
                this.f34676x = AccountInstance.getInstance(this.f34669c).getConnectionsManager().sendRequest(getwebpagepreview, new cg.m0(this, i12, string, 7));
            }
        }
        vp0 vp0Var2 = vp0VarArr[0];
        String str2 = this.B;
        if (str2 != null) {
            vp0Var2.f34026e.l(str2, false);
        }
        int i13 = this.f34668b;
        if (i11 == i13 || (wp0Var = this.D) == null) {
            return;
        }
        ((org.telegram.ui.mv) wp0Var).h(i13);
    }

    public final n9 f(int i10) {
        n9[] n9VarArr;
        if (this.f34668b == 1 && (n9VarArr = this.f34667a[0].h) != null && i10 >= 0 && i10 < n9VarArr.length && n9VarArr[i10].getVisibility() == 0) {
            return n9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f34670e = null;
        this.h = true;
        this.f34672n = true;
        this.f34673r = null;
        this.f34675w = null;
        d();
        this.f34674s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f34675w;
    }

    public int getMode() {
        return this.f34668b;
    }

    public final void h(int i10) {
        if (this.f34669c == i10) {
            this.f34669c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f34669c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f34669c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f34669c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f34669c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        wp0 wp0Var;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.f34670e = arrayList;
        this.h = false;
        this.f34675w = null;
        d();
        this.f34674s.clear();
        int i11 = this.f34668b;
        boolean z10 = (i11 == 1 || i11 == 0) ? false : true;
        this.f34668b = 1;
        if (z10) {
            k();
        }
        vp0[] vp0VarArr = this.f34667a;
        vp0 vp0Var = vp0VarArr[0];
        ImageView imageView = vp0Var.f34024b;
        org.telegram.ui.ActionBar.h5 h5Var = vp0Var.d;
        n9[] n9VarArr = vp0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = vp0Var.f34025c;
        imageView.setImageResource(R.drawable.filled_forward);
        vp0Var.f34024b.setVisibility(0);
        vp0Var.f34028n.setVisibility(8);
        vp0Var.f34027f.setVisibility(0);
        vp0Var.f34029r.setVisibility(8);
        vp0Var.f34023a.setClickable(true);
        ArrayList arrayList2 = this.f34670e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            h5Var2.l("", false);
            h5Var.l("", false);
            for (n9 n9Var : n9VarArr) {
                n9Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                h5Var2.l(LocaleController.getString(((MediaController.PhotoEntry) arrayList2.get(0)).isVideo ? R.string.ShareSendVideo : R.string.ShareSendPhoto), false);
            } else if (i12 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendPhotos", size2, new Object[0]), false);
            } else if (i13 == 0) {
                h5Var2.l(LocaleController.formatPluralString("ShareSendVideos", size2, new Object[0]), false);
            } else {
                h5Var2.l(LocaleController.formatPluralString("ShareSendItems", size2, new Object[0]), false);
            }
            h5Var.l(c(vp0Var), false);
            b(n9VarArr[0], arrayList2.size() > 0 ? (MediaController.PhotoEntry) arrayList2.get(0) : null);
            b(n9VarArr[1], arrayList2.size() > 1 ? (MediaController.PhotoEntry) arrayList2.get(1) : null);
            b(n9VarArr[2], arrayList2.size() > 2 ? (MediaController.PhotoEntry) arrayList2.get(2) : null);
        }
        vp0 vp0Var2 = vp0VarArr[0];
        String str = this.B;
        if (str != null) {
            vp0Var2.f34026e.l(str, false);
        }
        int i15 = this.f34668b;
        if (i11 == i15 || (wp0Var = this.D) == null) {
            return;
        }
        ((org.telegram.ui.mv) wp0Var).h(i15);
    }

    public final void j() {
        mb0 mb0Var = this.C;
        if (mb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mb0Var);
            this.C = null;
        }
        this.A = false;
        for (vp0 vp0Var : this.f34667a) {
            org.telegram.ui.ActionBar.h5 h5Var = vp0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            vp0Var.f34026e.setAlpha(0.0f);
        }
    }

    public final void k() {
        vp0[] vp0VarArr = this.f34667a;
        vp0 vp0Var = vp0VarArr[0];
        vp0 vp0Var2 = vp0VarArr[1];
        vp0VarArr[0] = vp0Var2;
        vp0VarArr[1] = vp0Var;
        vp0Var2.getClass();
        vp0VarArr[0].setVisibility(0);
        vp0VarArr[0].setScaleX(0.8f);
        vp0VarArr[0].setScaleY(0.8f);
        vp0VarArr[0].setAlpha(0.0f);
        vp0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = vp0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        er erVar = er.h;
        org.telegram.messenger.rl.o(viewPropertyAnimatorTranslationY, erVar, 320L);
        vp0 vp0Var3 = vp0VarArr[1];
        vp0Var3.getClass();
        vp0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(erVar).setDuration(320L).withEndAction(new up0(vp0Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f34669c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f34669c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (vp0 vp0Var : this.f34667a) {
            vp0Var.f34023a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(wp0 wp0Var) {
        this.D = wp0Var;
    }
}
