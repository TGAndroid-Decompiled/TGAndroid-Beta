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
public final class or0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int I = 0;
    public boolean E;
    public String F;
    public lr0 G;
    public nr0 H;
    public final mr0[] f28030a;
    public int f28031b;
    public int f28032c;
    public long d;
    public ArrayList e;
    public final ArrayList f28033f;
    public boolean h;
    public boolean f28034n;
    public String f28035r;
    public final ArrayList f28036s;
    public final HashMap v;
    public TLRPC.WebPage f28037w;
    public int f28038x;
    public int f28039y;

    public or0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f28030a = new mr0[2];
        this.f28031b = 0;
        this.f28033f = new ArrayList();
        this.f28034n = true;
        this.f28036s = new ArrayList();
        this.v = new HashMap();
        int i10 = 0;
        while (true) {
            mr0[] mr0VarArr = this.f28030a;
            if (i10 < mr0VarArr.length) {
                mr0VarArr[i10] = new mr0(this, activity, c6Var);
                addView(this.f28030a[i10], w7.a6.d(-1.0f, -1));
                i10++;
            } else {
                mr0VarArr[0].setVisibility(0);
                this.f28030a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(mr0 mr0Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = mr0Var.f27487b;
        z9 z9Var = mr0Var.f27490n;
        imageView.setImageResource(R.drawable.msg_link2);
        mr0Var.f27487b.setVisibility(0);
        mr0Var.f27489f.setVisibility(8);
        mr0Var.f27491r.setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        mr0Var.f27488c.l(str2, false);
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
        mr0Var.d.l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(40.0f));
            if (closestPhotoSizeWithSize != null) {
                z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                z9Var.k(ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize2, webPage.photo), "50_50_b", 0L, null, webPage, 1);
                z9Var.setVisibility(0);
            } else {
                z9Var.setVisibility(8);
            }
        } else {
            z9Var.setVisibility(8);
        }
        mr0Var.f27486a.setClickable(false);
    }

    public static void b(z9 z9Var, MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            z9Var.setVisibility(8);
            return;
        }
        z9Var.setVisibility(0);
        z9Var.q(0, true);
        String str = photoEntry.thumbPath;
        if (str != null) {
            z9Var.f(str, null, null);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                z9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
                return;
            }
            z9Var.p(photoEntry.orientation, photoEntry.invert, true);
            z9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, null);
        } else {
            z9Var.setImageDrawable(null);
        }
    }

    public final String c(mr0 mr0Var) {
        int measuredWidth;
        String shortName;
        ArrayList arrayList = this.f28033f;
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
                    shortName = DialogObject.getName(this.f28032c, longValue);
                } else {
                    shortName = DialogObject.getShortName(this.f28032c, longValue);
                }
                sb2.append(shortName);
            }
        }
        String formatString = LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        org.telegram.ui.ActionBar.h5 h5Var = mr0Var.d;
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
        if (this.f28038x != 0) {
            AccountInstance.getInstance(this.f28032c).getConnectionsManager().cancelRequest(this.f28038x, true);
            this.f28038x = 0;
        }
        this.f28039y++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f28037w != null && i11 == this.f28032c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f19369id == this.f28037w.f19369id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f28037w = null;
                        d();
                        if (this.f28031b != 0) {
                            this.f28031b = 0;
                            nr0 nr0Var = this.H;
                            if (nr0Var != null) {
                                ((org.telegram.ui.aw) nr0Var).h(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f28037w = webPage;
                        ArrayList arrayList = this.f28036s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.v;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f28030a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.or0.e(java.lang.CharSequence, boolean):void");
    }

    public final z9 f(int i10) {
        z9[] z9VarArr;
        if (this.f28031b == 1 && (z9VarArr = this.f28030a[0].h) != null && i10 >= 0 && i10 < z9VarArr.length && z9VarArr[i10].getVisibility() == 0) {
            return z9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = null;
        this.h = true;
        this.f28034n = true;
        this.f28035r = null;
        this.f28037w = null;
        d();
        this.f28036s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f28037w;
    }

    public int getMode() {
        return this.f28031b;
    }

    public final void h(int i10) {
        if (this.f28032c == i10) {
            this.f28032c = i10;
            if (isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f28032c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f28032c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
        this.f28032c = i10;
        if (isAttachedToWindow()) {
            NotificationCenter.getInstance(this.f28032c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        nr0 nr0Var;
        MediaController.PhotoEntry photoEntry;
        MediaController.PhotoEntry photoEntry2;
        int i11;
        h(i10);
        this.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        this.e = arrayList;
        this.h = false;
        MediaController.PhotoEntry photoEntry3 = null;
        this.f28037w = null;
        d();
        this.f28036s.clear();
        int i12 = this.f28031b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28031b = 1;
        if (z10) {
            k();
        }
        mr0[] mr0VarArr = this.f28030a;
        mr0 mr0Var = mr0VarArr[0];
        ImageView imageView = mr0Var.f27487b;
        org.telegram.ui.ActionBar.h5 h5Var = mr0Var.d;
        z9[] z9VarArr = mr0Var.h;
        org.telegram.ui.ActionBar.h5 h5Var2 = mr0Var.f27488c;
        imageView.setImageResource(R.drawable.filled_forward);
        mr0Var.f27487b.setVisibility(0);
        mr0Var.f27490n.setVisibility(8);
        mr0Var.f27489f.setVisibility(0);
        mr0Var.f27491r.setVisibility(8);
        mr0Var.f27486a.setClickable(true);
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
            h5Var.l(c(mr0Var), false);
            z9 z9Var = z9VarArr[0];
            if (arrayList2.size() > 0) {
                photoEntry = (MediaController.PhotoEntry) arrayList2.get(0);
            } else {
                photoEntry = null;
            }
            b(z9Var, photoEntry);
            z9 z9Var2 = z9VarArr[1];
            if (arrayList2.size() > 1) {
                photoEntry2 = (MediaController.PhotoEntry) arrayList2.get(1);
            } else {
                photoEntry2 = null;
            }
            b(z9Var2, photoEntry2);
            z9 z9Var3 = z9VarArr[2];
            if (arrayList2.size() > 2) {
                photoEntry3 = (MediaController.PhotoEntry) arrayList2.get(2);
            }
            b(z9Var3, photoEntry3);
        } else {
            h5Var2.l("", false);
            h5Var.l("", false);
            for (z9 z9Var4 : z9VarArr) {
                z9Var4.setVisibility(8);
            }
        }
        mr0 mr0Var2 = mr0VarArr[0];
        String str = this.F;
        if (str != null) {
            mr0Var2.e.l(str, false);
        }
        int i16 = this.f28031b;
        if (i12 != i16 && (nr0Var = this.H) != null) {
            ((org.telegram.ui.aw) nr0Var).h(i16);
        }
    }

    public final void j() {
        mr0[] mr0VarArr;
        lr0 lr0Var = this.G;
        if (lr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lr0Var);
            this.G = null;
        }
        this.E = false;
        for (mr0 mr0Var : this.f28030a) {
            org.telegram.ui.ActionBar.h5 h5Var = mr0Var.d;
            h5Var.setAlpha(1.0f);
            h5Var.setScaleX(1.0f);
            h5Var.setScaleY(1.0f);
            mr0Var.e.setAlpha(0.0f);
        }
    }

    public final void k() {
        mr0[] mr0VarArr = this.f28030a;
        mr0 mr0Var = mr0VarArr[0];
        mr0 mr0Var2 = mr0VarArr[1];
        mr0VarArr[0] = mr0Var2;
        mr0VarArr[1] = mr0Var;
        mr0Var2.getClass();
        mr0VarArr[0].setVisibility(0);
        mr0VarArr[0].setScaleX(0.8f);
        mr0VarArr[0].setScaleY(0.8f);
        mr0VarArr[0].setAlpha(0.0f);
        mr0VarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = mr0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        es esVar = es.h;
        org.telegram.messenger.yh.s(translationY, esVar, 320L);
        mr0 mr0Var3 = mr0VarArr[1];
        mr0Var3.getClass();
        mr0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(esVar).setDuration(320L).withEndAction(new lr0(mr0Var3, 1)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f28032c).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28032c).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (mr0 mr0Var : this.f28030a) {
            mr0Var.f27486a.setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(nr0 nr0Var) {
        this.H = nr0Var;
    }
}
