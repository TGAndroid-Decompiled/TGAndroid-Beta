package org.telegram.ui.ActionBar;

import ai.r9;
import ai.t7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gk;
import org.telegram.ui.ry;
import org.telegram.ui.sn;
public final class q3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint f21788a;
    public boolean f21789b;
    public boolean f21790c;
    public final ActionBarLayout d;
    public final o3 e;
    public int f21791f;
    public final org.telegram.ui.Components.g5 h;
    public int f21792n;
    public final org.telegram.ui.Components.g5 f21793r;
    public boolean f21794s;
    public final org.telegram.ui.Components.d6 v;
    public int f21795w;
    public boolean f21796x;
    public boolean f21797y;

    public q3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f21788a = new Paint(1);
        this.f21789b = true;
        this.f21790c = false;
        zr zrVar = zr.h;
        this.h = new org.telegram.ui.Components.g5(this, 200L, zrVar, 0);
        this.f21793r = new org.telegram.ui.Components.g5(this, 200L, zrVar, 0);
        this.v = new org.telegram.ui.Components.d6(this, 0L, 200L, zrVar);
        this.f21795w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(k6.x0(null, k6.f21126a7, false));
        o3 o3Var = new o3(this, this);
        this.e = o3Var;
        r0.i0.j(this, o3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (M == null) {
            TextPaint textPaint = new TextPaint(1);
            M = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            M.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return M;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        if (indexOf >= 0) {
            return str.substring(0, indexOf + 1);
        }
        return str;
    }

    public final void b() {
        z3 z3Var;
        ValueAnimator valueAnimator;
        ArrayList<p3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        p3 p3Var = (p3) i2.o1.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            z3Var = null;
        } else {
            z3Var = launchActivity.f33505y0;
        }
        if (z3Var != null && (valueAnimator = z3Var.d) != null) {
            valueAnimator.cancel();
            z3Var.d = null;
        }
        if (size != 1 && z3Var != null) {
            z3Var.f();
        } else {
            e(p3Var);
        }
    }

    public final n3 c(p3 p3Var) {
        ArrayList<n3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f21651a == p3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f7) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f7);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f7));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f10 = (width / 2.0f) * lerp;
        rectF.left = centerX - f10;
        rectF.right = centerX + f10;
        float f11 = (height / 2.0f) * lerp;
        rectF.top = centerY - f11;
        rectF.bottom = centerY + f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f21788a.setColor(this.h.a(this.f21791f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f21793r.a(this.f21792n, false);
            float e = this.v.e(this.f21794s);
            if (this.f21789b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    n3 n3Var = tabDrawables.get(i10);
                    float c10 = n3Var.c();
                    float b10 = n3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        n3Var.f21669w = 0.0f;
                        if (e > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        n3Var.f21660m = a2;
                        n3Var.f21662o = z10;
                        canvas2 = canvas;
                        n3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        o3 o3Var;
        if (this.f21789b && !getTabs().isEmpty() && (o3Var = this.e) != null && o3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(p3 p3Var) {
        sn snVar;
        gk gkVar;
        o2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof sn;
            if (z10 && (gkVar = (snVar = (sn) R).Y) != null) {
                gkVar.M();
                snVar.Y.k0(true, false, true);
            }
            if (p3Var.J != null) {
                ry sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.k4 k4Var = p3Var.J;
                org.telegram.ui.w3 w3Var = k4Var.K;
                l3.b(w3Var);
                sheetFragment.addSheet(w3Var);
                org.telegram.ui.v3 v3Var = w3Var.f42886c;
                w3Var.h = false;
                w3Var.f42888n = false;
                ValueAnimator valueAnimator = w3Var.f42893y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = w3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                w3Var.f42892x = 0.0f;
                w3Var.f42891w = 0.0f;
                w3Var.h();
                w3Var.n();
                v3Var.invalidate();
                v3Var.requestLayout();
                k4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                w3Var.g(sheetFragment);
                w3Var.f();
                h(this.f21795w, p3Var, false);
                return;
            }
            new m3(0, this, p3Var).run(R);
            if (p3Var.C) {
                if (!z10 || ((sn) R).a() != p3Var.f21755a.f11493c) {
                    this.f21790c = true;
                    AndroidUtilities.runOnUIThread(new ig.d2(this, R, sn.W9(p3Var.f21755a.f11493c), 20), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<p3> tabs = getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).d = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(p3 p3Var, Utilities.Callback callback) {
        String str;
        if (p3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!p3Var.f21775y) {
            h(this.f21795w, p3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(p3Var.f21755a.f11491a).getUser(Long.valueOf(p3Var.f21755a.f11493c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                gi.t4 t4Var = p3Var.f21755a;
                if (t4Var.f11495g == 6) {
                    str = t4Var.e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = str;
            c2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new t7(this, zArr, p3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ai.u2(zArr, callback, r8, 17));
            c2[] c2VarArr = {c2Var};
            c2Var.setOnDismissListener(new r9(zArr, callback));
            c2VarArr[0].show();
            r6.W((TextView) c2VarArr[0].d(-1), k6.f21422q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f21788a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return AndroidUtilities.dp(60.0f);
        }
        return AndroidUtilities.dp(68.0f);
    }

    public ArrayList<n3> getTabDrawables() {
        int i10 = this.f21795w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<n3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<n3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<p3> getTabs() {
        int i10 = this.f21795w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<p3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<p3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, p3 p3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = L;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(p3Var);
        if (z10) {
            p3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            n3 n3Var = (n3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(n3Var.f21651a);
            n3Var.d = indexOf;
            if (indexOf >= 0) {
                n3Var.f21653c = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new ig.d2(this, arrayList3, p3Var, 21), 320L);
        o(true);
        invalidate();
        o3 o3Var = this.e;
        if (o3Var != null) {
            o3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f21791f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z10 = false;
            }
            this.f21791f = i10;
            if (AndroidUtilities.computePerceivedBrightness(i10) < 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f7 = 0.08f;
            } else {
                f7 = 0.75f;
            }
            int v = k6.v(i10, k6.o1(f7, -1));
            this.f21792n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f21794s = z12;
            if (!z10) {
                this.h.a(this.f21791f, true);
                this.f21793r.a(this.f21792n, true);
                this.v.f(this.f21794s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        p3 p3Var;
        boolean z10;
        ArrayList<p3> tabs = getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        if (this.f21789b) {
            if (tabs.isEmpty()) {
                p3Var = null;
            } else {
                p3Var = tabs.get(0);
            }
            n3 c10 = c(p3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.f21659l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f21797y && i10 == 1) {
                            b();
                        } else if (this.f21796x && i10 == 1) {
                            g(p3Var, new ci.e(6));
                        }
                        this.f21796x = false;
                        this.f21797y = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f21796x = contains;
                    if (!contains && rectF.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f21797y = z10;
                    yVar.setState(this.f21796x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).f21659l.setState(new int[0]);
                    }
                }
            } else {
                this.f21797y = false;
                this.f21796x = false;
            }
        } else {
            this.f21797y = false;
            this.f21796x = false;
        }
        if (this.f21797y || this.f21796x) {
            return true;
        }
        return false;
    }

    public final p3 k(gi.t4 t4Var) {
        Integer valueOf = Integer.valueOf(this.f21795w);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f21795w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p3 p3Var = (p3) arrayList.get(i10);
            if (t4Var.equals(p3Var.f21755a)) {
                e(p3Var);
                return p3Var;
            }
        }
        return null;
    }

    public final p3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final p3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<p3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            p3 p3Var = tabs.get(i10);
            org.telegram.ui.k4 k4Var = p3Var.J;
            if (k4Var != null && !k4Var.f38758d0.isEmpty()) {
                Object i11 = i2.o1.i(1, p3Var.J.f38758d0);
                if ((i11 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i11).f20497id == webPage.f20497id) {
                    e(p3Var);
                    return p3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<p3> tabs = getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            n3 n3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && n3Var.f21653c == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, n3Var.f21651a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    n3Var.v = null;
                } else {
                    n3Var.v = new h11(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(n3Var.f21651a.b(), getTextPaint().getFontMetricsInt(), false);
                n3Var.v = null;
            }
            charSequence = replaceEmoji;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i11 = R.string.AccDescrTabs;
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(LocaleController.formatString(i11, charSequence));
    }

    public final void o(boolean z10) {
        if (this.H != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                this.F = null;
                valueAnimator.cancel();
            }
            this.H = getExpandedHeight();
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, this.H);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new v0(this, 4));
                this.F.addListener(new h(this, 3));
                this.F.setDuration(250L);
                this.F.setInterpolator(o1.f21718w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f45241a;
                r0.y.c((View) parent);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setCurrentAccount(int i10) {
        if (this.f21795w != i10) {
            this.f21795w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(n3 n3Var) {
        boolean z10 = false;
        int a2 = this.f21793r.a(this.f21792n, false);
        float e = this.v.e(this.f21794s);
        n3Var.f21669w = 0.0f;
        if (e > 0.5f) {
            z10 = true;
        }
        n3Var.f21660m = a2;
        n3Var.f21662o = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
