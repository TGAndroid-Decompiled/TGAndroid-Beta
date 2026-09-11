package org.telegram.ui.ActionBar;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.hz;
import org.telegram.ui.mk;
public final class o3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint f21253a;
    public boolean f21254b;
    public boolean f21255c;
    public final ActionBarLayout d;
    public final m3 f21256e;
    public int f21257f;
    public final org.telegram.ui.Components.h5 h;
    public int f21258n;
    public final org.telegram.ui.Components.h5 f21259r;
    public boolean f21260s;
    public final org.telegram.ui.Components.e6 v;
    public int f21261w;
    public boolean f21262x;
    public boolean f21263y;

    public o3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f21253a = new Paint(1);
        this.f21254b = true;
        this.f21255c = false;
        pr prVar = pr.h;
        this.h = new org.telegram.ui.Components.h5(this, 200L, prVar, 0);
        this.f21259r = new org.telegram.ui.Components.h5(this, 200L, prVar, 0);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 200L, prVar);
        this.f21261w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(j6.w0(null, j6.f20607a7, false));
        m3 m3Var = new m3(this, this);
        this.f21256e = m3Var;
        r0.i0.k(this, m3Var);
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
        x3 x3Var;
        ValueAnimator valueAnimator;
        ArrayList<n3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        n3 n3Var = (n3) i2.g.h(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            x3Var = null;
        } else {
            x3Var = launchActivity.f33469y0;
        }
        if (x3Var != null && (valueAnimator = x3Var.d) != null) {
            valueAnimator.cancel();
            x3Var.d = null;
        }
        if (size != 1 && x3Var != null) {
            x3Var.f();
        } else {
            e(n3Var);
        }
    }

    public final l3 c(n3 n3Var) {
        ArrayList<l3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f21146a == n3Var) {
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
        ArrayList<l3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f21253a.setColor(this.h.a(this.f21257f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f21259r.a(this.f21258n, false);
            float e7 = this.v.e(this.f21260s);
            if (this.f21254b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    l3 l3Var = tabDrawables.get(i10);
                    float c10 = l3Var.c();
                    float b10 = l3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        l3Var.v = 0.0f;
                        if (e7 > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l3Var.f21155l = a2;
                        l3Var.f21157n = z10;
                        canvas2 = canvas;
                        l3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        m3 m3Var;
        if (this.f21254b && !getTabs().isEmpty() && (m3Var = this.f21256e) != null && m3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(n3 n3Var) {
        co coVar;
        mk mkVar;
        n2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof co;
            if (z10 && (mkVar = (coVar = (co) R).Y) != null) {
                mkVar.P();
                coVar.Y.n0(true, false, true);
            }
            if (n3Var.J != null) {
                hz sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.i4 i4Var = n3Var.J;
                org.telegram.ui.v3 v3Var = i4Var.K;
                i3.b(v3Var);
                sheetFragment.addSheet(v3Var);
                org.telegram.ui.u3 u3Var = v3Var.f41395c;
                v3Var.h = false;
                v3Var.f41398n = false;
                ValueAnimator valueAnimator = v3Var.f41403y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = v3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                v3Var.f41402x = 0.0f;
                v3Var.f41401w = 0.0f;
                v3Var.h();
                v3Var.n();
                u3Var.invalidate();
                u3Var.requestLayout();
                i4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                v3Var.g(sheetFragment);
                v3Var.f();
                h(this.f21261w, n3Var, false);
                return;
            }
            new di.m2(23, this, n3Var).run(R);
            if (n3Var.C) {
                if (!z10 || ((co) R).a() != n3Var.f21216a.f9665c) {
                    this.f21255c = true;
                    AndroidUtilities.runOnUIThread(new p(this, R, co.R9(n3Var.f21216a.f9665c), 1), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).f21148c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(n3 n3Var, Utilities.Callback callback) {
        String str;
        if (n3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!n3Var.f21237y) {
            h(this.f21261w, n3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(n3Var.f21216a.f9663a).getUser(Long.valueOf(n3Var.f21216a.f9665c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            b2 b2Var = alertDialog$Builder.f20198a;
            b2Var.R = str;
            b2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new bi.q5(this, zArr, n3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 16));
            b2[] b2VarArr = {b2Var};
            b2Var.setOnDismissListener(new k3(zArr, callback));
            b2VarArr[0].show();
            ((TextView) b2VarArr[0].d(-1)).setTextColor(j6.w0(null, j6.f20898q7, false));
        }
    }

    public Paint getBackgroundPaint() {
        return this.f21253a;
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

    public ArrayList<l3> getTabDrawables() {
        int i10 = this.f21261w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<l3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<n3> getTabs() {
        int i10 = this.f21261w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<n3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<n3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, n3 n3Var, boolean z10) {
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
        arrayList.remove(n3Var);
        if (z10) {
            n3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            l3 l3Var = (l3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(l3Var.f21146a);
            l3Var.f21148c = indexOf;
            if (indexOf >= 0) {
                l3Var.f21147b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new p(this, arrayList3, n3Var, 2), 320L);
        o(true);
        invalidate();
        m3 m3Var = this.f21256e;
        if (m3Var != null) {
            m3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f21257f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            z10 = (!actionBarLayout.Q || actionBarLayout.T) ? false : false;
            this.f21257f = i10;
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
            int v = j6.v(i10, j6.l1(f7, -1));
            this.f21258n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f21260s = z12;
            if (!z10) {
                this.h.a(this.f21257f, true);
                this.f21259r.a(this.f21258n, true);
                this.v.f(this.f21260s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        n3 n3Var;
        boolean z10;
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        if (this.f21254b) {
            if (tabs.isEmpty()) {
                n3Var = null;
            } else {
                n3Var = tabs.get(0);
            }
            l3 c10 = c(n3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.f21154k;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f21263y && i10 == 1) {
                            b();
                        } else if (this.f21262x && i10 == 1) {
                            g(n3Var, new j3(0));
                        }
                        this.f21262x = false;
                        this.f21263y = false;
                        zVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = zVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f21262x = contains;
                    if (!contains && rectF.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f21263y = z10;
                    zVar.setState(this.f21262x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).f21154k.setState(new int[0]);
                    }
                }
            } else {
                this.f21263y = false;
                this.f21262x = false;
            }
        } else {
            this.f21263y = false;
            this.f21262x = false;
        }
        if (this.f21263y || this.f21262x) {
            return true;
        }
        return false;
    }

    public final n3 k(fi.f5 f5Var) {
        Integer valueOf = Integer.valueOf(this.f21261w);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f21261w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n3 n3Var = (n3) arrayList.get(i10);
            if (f5Var.equals(n3Var.f21216a)) {
                e(n3Var);
                return n3Var;
            }
        }
        return null;
    }

    public final n3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final n3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<n3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            n3 n3Var = tabs.get(i10);
            org.telegram.ui.i4 i4Var = n3Var.J;
            if (i4Var != null && !i4Var.f37216d0.isEmpty()) {
                Object h = i2.g.h(1, n3Var.J.f37216d0);
                if ((h instanceof TLRPC.WebPage) && ((TLRPC.WebPage) h).f20022id == webPage.f20022id) {
                    e(n3Var);
                    return n3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            l3 l3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && l3Var.f21147b == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, l3Var.f21146a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    l3Var.f21164u = null;
                } else {
                    l3Var.f21164u = new f01(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(l3Var.f21146a.b(), getTextPaint().getFontMetricsInt(), false);
                l3Var.f21164u = null;
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
                ofFloat.addUpdateListener(new w0(this, 4));
                this.F.addListener(new h(this, 3));
                this.F.setDuration(250L);
                this.F.setInterpolator(p1.f21275w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f44697a;
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
        if (this.f21261w != i10) {
            this.f21261w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(l3 l3Var) {
        boolean z10 = false;
        int a2 = this.f21259r.a(this.f21258n, false);
        float e7 = this.v.e(this.f21260s);
        l3Var.v = 0.0f;
        if (e7 > 0.5f) {
            z10 = true;
        }
        l3Var.f21155l = a2;
        l3Var.f21157n = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
