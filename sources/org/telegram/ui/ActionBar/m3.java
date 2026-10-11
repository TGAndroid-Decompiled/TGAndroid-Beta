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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fz;
import org.telegram.ui.ok;
import org.telegram.ui.zn;
public final class m3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint f21413a;
    public boolean f21414b;
    public boolean f21415c;
    public final ActionBarLayout d;
    public final k3 f21416e;
    public int f21417f;
    public final org.telegram.ui.Components.j5 h;
    public int f21418n;
    public final org.telegram.ui.Components.j5 f21419r;
    public boolean f21420s;
    public final org.telegram.ui.Components.g6 v;
    public int f21421w;
    public boolean f21422x;
    public boolean f21423y;

    public m3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f21413a = new Paint(1);
        this.f21414b = true;
        this.f21415c = false;
        is isVar = is.h;
        this.h = new org.telegram.ui.Components.j5(this, 200L, isVar, 0);
        this.f21419r = new org.telegram.ui.Components.j5(this, 200L, isVar, 0);
        this.v = new org.telegram.ui.Components.g6(this, 0L, 200L, isVar);
        this.f21421w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(h6.x0(null, h6.f20766a7, false));
        k3 k3Var = new k3(this, this);
        this.f21416e = k3Var;
        r0.i0.j(this, k3Var);
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
        v3 v3Var;
        ValueAnimator valueAnimator;
        ArrayList<l3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        l3 l3Var = (l3) hg.c.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            v3Var = null;
        } else {
            v3Var = launchActivity.f33885y0;
        }
        if (v3Var != null && (valueAnimator = v3Var.d) != null) {
            valueAnimator.cancel();
            v3Var.d = null;
        }
        if (size != 1 && v3Var != null) {
            v3Var.f();
        } else {
            e(l3Var);
        }
    }

    public final j3 c(l3 l3Var) {
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f21252a == l3Var) {
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
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f21413a.setColor(this.h.a(this.f21417f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f21419r.a(this.f21418n, false);
            float e7 = this.v.e(this.f21420s);
            if (this.f21414b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    j3 j3Var = tabDrawables.get(i10);
                    float c10 = j3Var.c();
                    float b10 = j3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        j3Var.f21271w = 0.0f;
                        if (e7 > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j3Var.f21262m = a2;
                        j3Var.f21264o = z10;
                        canvas2 = canvas;
                        j3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        k3 k3Var;
        if (this.f21414b && !getTabs().isEmpty() && (k3Var = this.f21416e) != null && k3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(l3 l3Var) {
        zn znVar;
        ok okVar;
        m2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof zn;
            if (z10 && (okVar = (znVar = (zn) R).Y) != null) {
                okVar.N();
                znVar.Y.l0(true, false, true);
            }
            if (l3Var.J != null) {
                fz sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.h4 h4Var = l3Var.J;
                org.telegram.ui.u3 u3Var = h4Var.K;
                h3.b(u3Var);
                sheetFragment.addSheet(u3Var);
                org.telegram.ui.t3 t3Var = u3Var.f42370c;
                u3Var.h = false;
                u3Var.f42373n = false;
                ValueAnimator valueAnimator = u3Var.f42378y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = u3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                u3Var.f42377x = 0.0f;
                u3Var.f42376w = 0.0f;
                u3Var.h();
                u3Var.n();
                t3Var.invalidate();
                t3Var.requestLayout();
                h4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                u3Var.g(sheetFragment);
                u3Var.f();
                h(this.f21421w, l3Var, false);
                return;
            }
            new ai.h3(24, this, l3Var).run(R);
            if (l3Var.C) {
                if (!z10 || ((zn) R).a() != l3Var.f21366a.f9037c) {
                    this.f21415c = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, R, zn.W9(l3Var.f21366a.f9037c), 5), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
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

    public final void g(l3 l3Var, Utilities.Callback callback) {
        String str;
        if (l3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!l3Var.f21387y) {
            h(this.f21421w, l3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(l3Var.f21366a.f9035a).getUser(Long.valueOf(l3Var.f21366a.f9037c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                ei.e5 e5Var = l3Var.f21366a;
                if (e5Var.f9040g == 6) {
                    str = e5Var.f9038e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.R = str;
            a2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new ai.h6(this, zArr, l3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ai.r5(zArr, callback, r8, 16));
            a2[] a2VarArr = {a2Var};
            a2Var.setOnDismissListener(new i3(zArr, callback));
            a2VarArr[0].show();
            ((TextView) a2VarArr[0].d(-1)).setTextColor(h6.x0(null, h6.f21062q7, false));
        }
    }

    public Paint getBackgroundPaint() {
        return this.f21413a;
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

    public ArrayList<j3> getTabDrawables() {
        int i10 = this.f21421w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<j3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<j3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<l3> getTabs() {
        int i10 = this.f21421w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<l3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, l3 l3Var, boolean z10) {
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
        arrayList.remove(l3Var);
        if (z10) {
            l3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            j3 j3Var = (j3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(j3Var.f21252a);
            j3Var.d = indexOf;
            if (indexOf >= 0) {
                j3Var.f21254c = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, arrayList3, l3Var, 6), 320L);
        o(true);
        invalidate();
        k3 k3Var = this.f21416e;
        if (k3Var != null) {
            k3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f21417f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z10 = false;
            }
            this.f21417f = i10;
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
            int v = h6.v(i10, h6.m1(f7, -1));
            this.f21418n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f21420s = z12;
            if (!z10) {
                this.h.a(this.f21417f, true);
                this.f21419r.a(this.f21418n, true);
                this.v.f(this.f21420s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        l3 l3Var;
        boolean z10;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.f21414b) {
            if (tabs.isEmpty()) {
                l3Var = null;
            } else {
                l3Var = tabs.get(0);
            }
            j3 c10 = c(l3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.f21261l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f21423y && i10 == 1) {
                            b();
                        } else if (this.f21422x && i10 == 1) {
                            g(l3Var, new ai.i(6));
                        }
                        this.f21422x = false;
                        this.f21423y = false;
                        zVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = zVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f21422x = contains;
                    if (!contains && rectF.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f21423y = z10;
                    zVar.setState(this.f21422x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).f21261l.setState(new int[0]);
                    }
                }
            } else {
                this.f21423y = false;
                this.f21422x = false;
            }
        } else {
            this.f21423y = false;
            this.f21422x = false;
        }
        if (this.f21423y || this.f21422x) {
            return true;
        }
        return false;
    }

    public final l3 k(ei.e5 e5Var) {
        Integer valueOf = Integer.valueOf(this.f21421w);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f21421w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l3 l3Var = (l3) arrayList.get(i10);
            if (e5Var.equals(l3Var.f21366a)) {
                e(l3Var);
                return l3Var;
            }
        }
        return null;
    }

    public final l3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final l3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<l3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            l3 l3Var = tabs.get(i10);
            org.telegram.ui.h4 h4Var = l3Var.J;
            if (h4Var != null && !h4Var.f38303d0.isEmpty()) {
                Object g10 = hg.c.g(1, l3Var.J.f38303d0);
                if ((g10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g10).f20221id == webPage.f20221id) {
                    e(l3Var);
                    return l3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            j3 j3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && j3Var.f21254c == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, j3Var.f21252a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    j3Var.v = null;
                } else {
                    j3Var.v = new m11(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(j3Var.f21252a.b(), getTextPaint().getFontMetricsInt(), false);
                j3Var.v = null;
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
                this.F.setInterpolator(o1.f21443w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f46890a;
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
        if (this.f21421w != i10) {
            this.f21421w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(j3 j3Var) {
        boolean z10 = false;
        int a2 = this.f21419r.a(this.f21418n, false);
        float e7 = this.v.e(this.f21420s);
        j3Var.f21271w = 0.0f;
        if (e7 > 0.5f) {
            z10 = true;
        }
        j3Var.f21262m = a2;
        j3Var.f21264o = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
