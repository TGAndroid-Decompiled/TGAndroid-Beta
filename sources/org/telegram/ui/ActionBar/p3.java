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
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.qr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.jz;
import org.telegram.ui.nk;
public final class p3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint f19488a;
    public boolean f19489b;
    public boolean f19490c;
    public final ActionBarLayout d;
    public final n3 e;
    public int f19491f;
    public final org.telegram.ui.Components.f5 h;
    public int f19492n;
    public final org.telegram.ui.Components.f5 f19493r;
    public boolean f19494s;
    public final org.telegram.ui.Components.c6 v;
    public int f19495w;
    public boolean f19496x;
    public boolean f19497y;

    public p3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f19488a = new Paint(1);
        this.f19489b = true;
        this.f19490c = false;
        qr qrVar = qr.h;
        this.h = new org.telegram.ui.Components.f5(this, 200L, qrVar, 0);
        this.f19493r = new org.telegram.ui.Components.f5(this, 200L, qrVar, 0);
        this.v = new org.telegram.ui.Components.c6(this, 0L, 200L, qrVar);
        this.f19495w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(j6.w0(null, j6.f18807a7, false));
        n3 n3Var = new n3(this, this);
        this.e = n3Var;
        r0.i0.k(this, n3Var);
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
        y3 y3Var;
        ValueAnimator valueAnimator;
        ArrayList<o3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        o3 o3Var = (o3) hg.k0.h(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            y3Var = null;
        } else {
            y3Var = launchActivity.f30877y0;
        }
        if (y3Var != null && (valueAnimator = y3Var.d) != null) {
            valueAnimator.cancel();
            y3Var.d = null;
        }
        if (size != 1 && y3Var != null) {
            y3Var.f();
        } else {
            e(o3Var);
        }
    }

    public final m3 c(o3 o3Var) {
        ArrayList<m3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f19401a == o3Var) {
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
        ArrayList<m3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f19488a.setColor(this.h.a(this.f19491f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f19493r.a(this.f19492n, false);
            float e = this.v.e(this.f19494s);
            if (this.f19489b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    m3 m3Var = tabDrawables.get(i10);
                    float c10 = m3Var.c();
                    float b10 = m3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        m3Var.v = 0.0f;
                        if (e > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m3Var.f19409l = a2;
                        m3Var.f19411n = z10;
                        canvas2 = canvas;
                        m3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        n3 n3Var;
        if (this.f19489b && !getTabs().isEmpty() && (n3Var = this.e) != null && n3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(o3 o3Var) {
        bo boVar;
        nk nkVar;
        o2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof bo;
            if (z10 && (nkVar = (boVar = (bo) R).Y) != null) {
                nkVar.Q();
                boVar.Y.o0(true, false, true);
            }
            if (o3Var.J != null) {
                jz sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.h4 h4Var = o3Var.J;
                org.telegram.ui.u3 u3Var = h4Var.K;
                j3.b(u3Var);
                sheetFragment.addSheet(u3Var);
                org.telegram.ui.t3 t3Var = u3Var.f37926c;
                u3Var.h = false;
                u3Var.f37928n = false;
                ValueAnimator valueAnimator = u3Var.f37933y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = u3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                u3Var.f37932x = 0.0f;
                u3Var.f37931w = 0.0f;
                u3Var.h();
                u3Var.n();
                t3Var.invalidate();
                t3Var.requestLayout();
                h4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                u3Var.g(sheetFragment);
                u3Var.f();
                h(this.f19495w, o3Var, false);
                return;
            }
            new ci.m2(23, this, o3Var).run(R);
            if (o3Var.C) {
                if (!z10 || ((bo) R).a() != o3Var.f19454a.f8342c) {
                    this.f19490c = true;
                    AndroidUtilities.runOnUIThread(new q(this, R, bo.R9(o3Var.f19454a.f8342c), 1), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<o3> tabs = getTabs();
        ArrayList<m3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).f19403c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(o3 o3Var, Utilities.Callback callback) {
        String str;
        if (o3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!o3Var.f19474y) {
            h(this.f19495w, o3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(o3Var.f19454a.f8340a).getUser(Long.valueOf(o3Var.f19454a.f8342c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            c2 c2Var = alertDialog$Builder.f18447a;
            c2Var.R = str;
            c2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new ai.h6(this, zArr, o3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ai.r5(zArr, callback, r8, 16));
            c2[] c2VarArr = {c2Var};
            c2Var.setOnDismissListener(new l3(zArr, callback));
            c2VarArr[0].show();
            ((TextView) c2VarArr[0].d(-1)).setTextColor(j6.w0(null, j6.f19101q7, false));
        }
    }

    public Paint getBackgroundPaint() {
        return this.f19488a;
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

    public ArrayList<m3> getTabDrawables() {
        int i10 = this.f19495w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<m3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<m3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<o3> getTabs() {
        int i10 = this.f19495w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<o3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<o3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, o3 o3Var, boolean z10) {
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
        arrayList.remove(o3Var);
        if (z10) {
            o3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            m3 m3Var = (m3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(m3Var.f19401a);
            m3Var.f19403c = indexOf;
            if (indexOf >= 0) {
                m3Var.f19402b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new q(this, arrayList3, o3Var, 2), 320L);
        o(true);
        invalidate();
        n3 n3Var = this.e;
        if (n3Var != null) {
            n3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f19491f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            z10 = (!actionBarLayout.Q || actionBarLayout.T) ? false : false;
            this.f19491f = i10;
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
            this.f19492n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f19494s = z12;
            if (!z10) {
                this.h.a(this.f19491f, true);
                this.f19493r.a(this.f19492n, true);
                this.v.f(this.f19494s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        o3 o3Var;
        boolean z10;
        ArrayList<o3> tabs = getTabs();
        ArrayList<m3> tabDrawables = getTabDrawables();
        if (this.f19489b) {
            if (tabs.isEmpty()) {
                o3Var = null;
            } else {
                o3Var = tabs.get(0);
            }
            m3 c10 = c(o3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.f19408k;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f19497y && i10 == 1) {
                            b();
                        } else if (this.f19496x && i10 == 1) {
                            g(o3Var, new k3(0));
                        }
                        this.f19496x = false;
                        this.f19497y = false;
                        zVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = zVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f19496x = contains;
                    if (!contains && rectF.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f19497y = z10;
                    zVar.setState(this.f19496x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).f19408k.setState(new int[0]);
                    }
                }
            } else {
                this.f19497y = false;
                this.f19496x = false;
            }
        } else {
            this.f19497y = false;
            this.f19496x = false;
        }
        if (this.f19497y || this.f19496x) {
            return true;
        }
        return false;
    }

    public final o3 k(ei.f5 f5Var) {
        Integer valueOf = Integer.valueOf(this.f19495w);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f19495w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o3 o3Var = (o3) arrayList.get(i10);
            if (f5Var.equals(o3Var.f19454a)) {
                e(o3Var);
                return o3Var;
            }
        }
        return null;
    }

    public final o3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final o3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<o3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            o3 o3Var = tabs.get(i10);
            org.telegram.ui.h4 h4Var = o3Var.J;
            if (h4Var != null && !h4Var.f34157d0.isEmpty()) {
                Object h = hg.k0.h(1, o3Var.J.f34157d0);
                if ((h instanceof TLRPC.WebPage) && ((TLRPC.WebPage) h).f18274id == webPage.f18274id) {
                    e(o3Var);
                    return o3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<o3> tabs = getTabs();
        ArrayList<m3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            m3 m3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && m3Var.f19402b == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, m3Var.f19401a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    m3Var.f19418u = null;
                } else {
                    m3Var.f19418u = new h01(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(m3Var.f19401a.b(), getTextPaint().getFontMetricsInt(), false);
                m3Var.f19418u = null;
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
                ofFloat.addUpdateListener(new x0(this, 4));
                this.F.addListener(new h(this, 3));
                this.F.setDuration(250L);
                this.F.setInterpolator(q1.f19508w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f41870a;
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
        if (this.f19495w != i10) {
            this.f19495w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(m3 m3Var) {
        boolean z10 = false;
        int a2 = this.f19493r.a(this.f19492n, false);
        float e = this.v.e(this.f19494s);
        m3Var.v = 0.0f;
        if (e > 0.5f) {
            z10 = true;
        }
        m3Var.f19409l = a2;
        m3Var.f19411n = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
