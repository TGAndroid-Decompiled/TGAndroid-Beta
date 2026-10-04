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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.tr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hz;
import org.telegram.ui.jk;
import org.telegram.ui.yn;
public final class n3 extends FrameLayout {
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
    public final l3 f21416e;
    public int f21417f;
    public final org.telegram.ui.Components.h5 h;
    public int f21418n;
    public final org.telegram.ui.Components.h5 f21419r;
    public boolean f21420s;
    public final org.telegram.ui.Components.e6 v;
    public int f21421w;
    public boolean f21422x;
    public boolean f21423y;

    public n3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f21413a = new Paint(1);
        this.f21414b = true;
        this.f21415c = false;
        tr trVar = tr.h;
        this.h = new org.telegram.ui.Components.h5(this, 200L, trVar, 0);
        this.f21419r = new org.telegram.ui.Components.h5(this, 200L, trVar, 0);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 200L, trVar);
        this.f21421w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(i6.w0(null, i6.f20761a7, false));
        l3 l3Var = new l3(this, this);
        this.f21416e = l3Var;
        r0.i0.k(this, l3Var);
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
        w3 w3Var;
        ValueAnimator valueAnimator;
        ArrayList<m3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        m3 m3Var = (m3) hg.k0.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            w3Var = null;
        } else {
            w3Var = launchActivity.f33813y0;
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
            if (tabDrawables.get(i10).f21306a == m3Var) {
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
        ArrayList<k3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f21413a.setColor(this.h.a(this.f21417f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f21419r.a(this.f21418n, false);
            float e7 = this.v.e(this.f21420s);
            if (this.f21414b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    k3 k3Var = tabDrawables.get(i10);
                    float c10 = k3Var.c();
                    float b10 = k3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        k3Var.v = 0.0f;
                        if (e7 > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k3Var.f21315l = a2;
                        k3Var.f21317n = z10;
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
        if (this.f21414b && !getTabs().isEmpty() && (l3Var = this.f21416e) != null && l3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(m3 m3Var) {
        yn ynVar;
        jk jkVar;
        n2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof yn;
            if (z10 && (jkVar = (ynVar = (yn) R).W) != null) {
                jkVar.N();
                ynVar.W.n0(true, false, true);
            }
            if (m3Var.J != null) {
                hz sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.i4 i4Var = m3Var.J;
                org.telegram.ui.v3 v3Var = i4Var.K;
                i3.b(v3Var);
                sheetFragment.addSheet(v3Var);
                org.telegram.ui.u3 u3Var = v3Var.f41531c;
                v3Var.h = false;
                v3Var.f41534n = false;
                ValueAnimator valueAnimator = v3Var.f41539y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = v3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                v3Var.f41538x = 0.0f;
                v3Var.f41537w = 0.0f;
                v3Var.h();
                v3Var.n();
                u3Var.invalidate();
                u3Var.requestLayout();
                i4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                v3Var.g(sheetFragment);
                v3Var.f();
                h(this.f21421w, m3Var, false);
                return;
            }
            new ai.g3(24, this, m3Var).run(R);
            if (m3Var.C) {
                if (!z10 || ((yn) R).a() != m3Var.f21368a.f9038c) {
                    this.f21415c = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, R, yn.Q9(m3Var.f21368a.f9038c), 4), 220L);
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
            tabDrawables.get(i11).f21308c = -1;
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
        } else if (!m3Var.f21389y) {
            h(this.f21421w, m3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(m3Var.f21368a.f9036a).getUser(Long.valueOf(m3Var.f21368a.f9038c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            b2 b2Var = alertDialog$Builder.f20367a;
            b2Var.R = str;
            b2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new ai.g6(this, zArr, m3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ai.q5(zArr, callback, r8, 16));
            b2[] b2VarArr = {b2Var};
            b2Var.setOnDismissListener(new j3(zArr, callback));
            b2VarArr[0].show();
            ((TextView) b2VarArr[0].d(-1)).setTextColor(i6.w0(null, i6.f21058q7, false));
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

    public ArrayList<k3> getTabDrawables() {
        int i10 = this.f21421w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
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
        int i10 = this.f21421w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<m3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<m3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, m3 m3Var, boolean z10) {
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
        arrayList.remove(m3Var);
        if (z10) {
            m3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            k3 k3Var = (k3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(k3Var.f21306a);
            k3Var.f21308c = indexOf;
            if (indexOf >= 0) {
                k3Var.f21307b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, arrayList3, m3Var, 5), 320L);
        o(true);
        invalidate();
        l3 l3Var = this.f21416e;
        if (l3Var != null) {
            l3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f21417f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            z10 = (!actionBarLayout.Q || actionBarLayout.T) ? false : false;
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
            int v = i6.v(i10, i6.l1(f7, -1));
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
        m3 m3Var;
        boolean z10;
        ArrayList<m3> tabs = getTabs();
        ArrayList<k3> tabDrawables = getTabDrawables();
        if (this.f21414b) {
            if (tabs.isEmpty()) {
                m3Var = null;
            } else {
                m3Var = tabs.get(0);
            }
            k3 c10 = c(m3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.f21314k;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f21423y && i10 == 1) {
                            b();
                        } else if (this.f21422x && i10 == 1) {
                            g(m3Var, new ai.i(6));
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
                        tabDrawables.get(i11).f21314k.setState(new int[0]);
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

    public final m3 k(ei.f5 f5Var) {
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
            m3 m3Var = (m3) arrayList.get(i10);
            if (f5Var.equals(m3Var.f21368a)) {
                e(m3Var);
                return m3Var;
            }
        }
        return null;
    }

    public final m3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final m3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<m3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            m3 m3Var = tabs.get(i10);
            org.telegram.ui.i4 i4Var = m3Var.J;
            if (i4Var != null && !i4Var.f37258d0.isEmpty()) {
                Object g10 = hg.k0.g(1, m3Var.J.f37258d0);
                if ((g10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g10).f20190id == webPage.f20190id) {
                    e(m3Var);
                    return m3Var;
                }
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
            if (tabs.size() > 1 && k3Var.f21307b == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, k3Var.f21306a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    k3Var.f21324u = null;
                } else {
                    k3Var.f21324u = new e11(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(k3Var.f21306a.b(), getTextPaint().getFontMetricsInt(), false);
                k3Var.f21324u = null;
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
                this.F.setInterpolator(p1.f21443w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f45595a;
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

    public void setupTab(k3 k3Var) {
        boolean z10 = false;
        int a2 = this.f21419r.a(this.f21418n, false);
        float e7 = this.v.e(this.f21420s);
        k3Var.v = 0.0f;
        if (e7 > 0.5f) {
            z10 = true;
        }
        k3Var.f21315l = a2;
        k3Var.f21317n = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
