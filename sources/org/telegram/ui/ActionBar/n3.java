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
import lh.g7;
import lh.p6;
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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ez;
import org.telegram.ui.lk;
import org.telegram.ui.zn;
public final class n3 extends FrameLayout {
    public static final HashMap H = new HashMap();
    public static final HashMap I = new HashMap();
    public static TextPaint J;
    public final RectF B;
    public ValueAnimator C;
    public float D;
    public int E;
    public final HashSet F;
    public final HashSet G;
    public final Paint f20456a;
    public boolean f20457b;
    public boolean f20458c;
    public final ActionBarLayout d;
    public final l3 e;
    public int f20459f;
    public final org.telegram.ui.Components.c5 h;
    public int f20460n;
    public final org.telegram.ui.Components.c5 f20461r;
    public boolean f20462s;
    public final org.telegram.ui.Components.z5 v;
    public int f20463w;
    public boolean f20464x;
    public boolean f20465y;

    public n3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f20456a = new Paint(1);
        this.f20457b = true;
        this.f20458c = false;
        mr mrVar = mr.h;
        this.h = new org.telegram.ui.Components.c5(this, 200L, mrVar, 0);
        this.f20461r = new org.telegram.ui.Components.c5(this, 200L, mrVar, 0);
        this.v = new org.telegram.ui.Components.z5(this, 0L, 200L, mrVar);
        this.f20463w = UserConfig.selectedAccount;
        this.B = new RectF();
        this.F = new HashSet();
        this.G = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(j6.w0(null, j6.f19827a7, false));
        l3 l3Var = new l3(this, this);
        this.e = l3Var;
        r0.j0.k(this, l3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (J == null) {
            TextPaint textPaint = new TextPaint(1);
            J = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            J.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return J;
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
        w3 w3Var;
        ValueAnimator valueAnimator;
        ArrayList<m3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        m3 m3Var = (m3) kf.k0.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            w3Var = null;
        } else {
            w3Var = launchActivity.f31628v0;
        }
        if (w3Var != null && (valueAnimator = w3Var.d) != null) {
            valueAnimator.cancel();
            w3Var.d = null;
        }
        if (size != 1 && w3Var != null) {
            w3Var.f();
        } else {
            e(m3Var);
        }
    }

    public final k3 c(m3 m3Var) {
        ArrayList<k3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f20335a == m3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f10) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f10);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f10));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f11 = (width / 2.0f) * lerp;
        rectF.left = centerX - f11;
        rectF.right = centerX + f11;
        float f12 = (height / 2.0f) * lerp;
        rectF.top = centerY - f12;
        rectF.bottom = centerY + f12;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        Canvas canvas2;
        getTabs();
        ArrayList<k3> tabDrawables = getTabDrawables();
        if (this.D > 0.0f) {
            this.f20456a.setColor(this.h.a(this.f20459f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f20461r.a(this.f20460n, false);
            float e = this.v.e(this.f20462s);
            if (this.f20457b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    k3 k3Var = tabDrawables.get(i10);
                    float c3 = k3Var.c();
                    float b10 = k3Var.b();
                    if (b10 <= 0.0f || c3 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.B;
                        d(rectF, c3);
                        k3Var.v = 0.0f;
                        if (e > 0.5f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        k3Var.f20343l = a2;
                        k3Var.f20345n = z4;
                        canvas2 = canvas;
                        k3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        l3 l3Var;
        if (this.f20457b && !getTabs().isEmpty() && (l3Var = this.e) != null && l3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(m3 m3Var) {
        zn znVar;
        lk lkVar;
        p2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z4 = R instanceof zn;
            if (z4 && (lkVar = (znVar = (zn) R).V) != null) {
                lkVar.P();
                znVar.V.n0(true, false, true);
            }
            if (m3Var.J != null) {
                ez sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.n4 n4Var = m3Var.J;
                org.telegram.ui.a4 a4Var = n4Var.H;
                j3.b(a4Var);
                sheetFragment.addSheet(a4Var);
                org.telegram.ui.z3 z3Var = a4Var.f32442c;
                a4Var.h = false;
                a4Var.f32444n = false;
                ValueAnimator valueAnimator = a4Var.f32449y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = a4Var.B;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                a4Var.f32448x = 0.0f;
                a4Var.f32447w = 0.0f;
                a4Var.h();
                a4Var.n();
                z3Var.invalidate();
                z3Var.requestLayout();
                n4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                a4Var.g(sheetFragment);
                a4Var.f();
                h(this.f20463w, m3Var, false);
                return;
            }
            new kh.a1(10, this, m3Var).run(R);
            if (m3Var.C) {
                if (!z4 || ((zn) R).a() != m3Var.f20423a.f43921c) {
                    this.f20458c = true;
                    AndroidUtilities.runOnUIThread(new p6(this, R, zn.R9(m3Var.f20423a.f43921c), 18), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<m3> tabs = getTabs();
        ArrayList<k3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).f20337c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(m3 m3Var, Utilities.Callback callback) {
        String str;
        if (m3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!m3Var.f20443y) {
            h(this.f20463w, m3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(m3Var.f20423a.f43919a).getUser(Long.valueOf(m3Var.f20423a.f43921c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            d2 d2Var = alertDialog$Builder.f19478a;
            d2Var.O = str;
            d2Var.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, m3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 11));
            d2[] d2VarArr = {d2Var};
            d2Var.setOnDismissListener(new g7(zArr, callback));
            d2VarArr[0].show();
            ((TextView) d2VarArr[0].d(-1)).setTextColor(j6.w0(null, j6.f20116q7, false));
        }
    }

    public Paint getBackgroundPaint() {
        return this.f20456a;
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

    public ArrayList<k3> getTabDrawables() {
        int i10 = this.f20463w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = I;
        ArrayList<k3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<k3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<m3> getTabs() {
        int i10 = this.f20463w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = H;
        ArrayList<m3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<m3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, m3 m3Var, boolean z4) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = H;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = I;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(m3Var);
        if (z4) {
            m3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            k3 k3Var = (k3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(k3Var.f20335a);
            k3Var.f20337c = indexOf;
            if (indexOf >= 0) {
                k3Var.f20336b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new p6(this, arrayList3, m3Var, 19), 320L);
        o(true);
        invalidate();
        l3 l3Var = this.e;
        if (l3Var != null) {
            l3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z4) {
        boolean z10;
        float f10;
        if (i10 != this.f20459f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z11 = false;
            z4 = (!actionBarLayout.N || actionBarLayout.Q) ? false : false;
            this.f20459f = i10;
            if (AndroidUtilities.computePerceivedBrightness(i10) < 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = 0.08f;
            } else {
                f10 = 0.75f;
            }
            int v = j6.v(i10, j6.l1(f10, -1));
            this.f20460n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z11 = true;
            }
            this.f20462s = z11;
            if (!z4) {
                this.h.a(this.f20459f, true);
                this.f20461r.a(this.f20460n, true);
                this.v.f(this.f20462s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i10) {
        m3 m3Var;
        boolean z4;
        ArrayList<m3> tabs = getTabs();
        ArrayList<k3> tabDrawables = getTabDrawables();
        if (this.f20457b) {
            if (tabs.isEmpty()) {
                m3Var = null;
            } else {
                m3Var = tabs.get(0);
            }
            k3 c3 = c(m3Var);
            if (c3 != null) {
                org.telegram.ui.Cells.z zVar = c3.f20342k;
                float c10 = c3.c();
                RectF rectF = this.B;
                d(rectF, c10);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f20465y && i10 == 1) {
                            b();
                        } else if (this.f20464x && i10 == 1) {
                            g(m3Var, new gg.h(1));
                        }
                        this.f20464x = false;
                        this.f20465y = false;
                        zVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = zVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f20464x = contains;
                    if (!contains && rectF.contains(f10, f11)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f20465y = z4;
                    zVar.setState(this.f20464x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c3) {
                        tabDrawables.get(i11).f20342k.setState(new int[0]);
                    }
                }
            } else {
                this.f20465y = false;
                this.f20464x = false;
            }
        } else {
            this.f20465y = false;
            this.f20464x = false;
        }
        if (this.f20465y || this.f20464x) {
            return true;
        }
        return false;
    }

    public final m3 k(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return l(webPage);
    }

    public final m3 l(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<m3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            m3 m3Var = tabs.get(i10);
            org.telegram.ui.n4 n4Var = m3Var.J;
            if (n4Var != null && !n4Var.f36359a0.isEmpty()) {
                Object i11 = kf.k0.i(1, m3Var.J.f36359a0);
                if ((i11 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i11).f19312id == webPage.f19312id) {
                    e(m3Var);
                    return m3Var;
                }
            }
        }
        return null;
    }

    public final m3 m(rh.y3 y3Var) {
        Integer valueOf = Integer.valueOf(this.f20463w);
        HashMap hashMap = H;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f20463w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m3 m3Var = (m3) arrayList.get(i10);
            if (y3Var.equals(m3Var.f20423a)) {
                e(m3Var);
                return m3Var;
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<m3> tabs = getTabs();
        ArrayList<k3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            k3 k3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && k3Var.f20336b == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, k3Var.f20335a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    k3Var.f20352u = null;
                } else {
                    k3Var.f20352u = new k01(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(k3Var.f20335a.b(), getTextPaint().getFontMetricsInt(), false);
                k3Var.f20352u = null;
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

    public final void o(boolean z4) {
        if (this.E != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                this.C = null;
                valueAnimator.cancel();
            }
            this.E = getExpandedHeight();
            Iterator it = this.G.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, this.E);
                this.C = ofFloat;
                ofFloat.addUpdateListener(new x0(this, 4));
                this.C.addListener(new h(this, 3));
                this.C.setDuration(250L);
                this.C.setInterpolator(r1.f20518w);
                this.C.start();
            } else {
                this.D = this.E;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.j0.f43142a;
                r0.z.c((View) parent);
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
        if (this.f20463w != i10) {
            this.f20463w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(k3 k3Var) {
        boolean z4 = false;
        int a2 = this.f20461r.a(this.f20460n, false);
        float e = this.v.e(this.f20462s);
        k3Var.v = 0.0f;
        if (e > 0.5f) {
            z4 = true;
        }
        k3Var.f20343l = a2;
        k3Var.f20345n = z4;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
