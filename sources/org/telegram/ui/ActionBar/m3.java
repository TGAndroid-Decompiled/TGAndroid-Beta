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
import android.widget.FrameLayout;
import android.widget.TextView;
import hh.h7;
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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

public final class m3 extends FrameLayout {
    public static final HashMap G = new HashMap();
    public static final HashMap H = new HashMap();
    public static TextPaint I;
    public final RectF A;
    public ValueAnimator B;
    public float C;
    public int D;
    public final HashSet E;
    public final HashSet F;

    public final Paint f23657a;

    public boolean f23658b;

    public boolean f23659c;
    public final ActionBarLayout d;

    public final k3 f23660e;

    public int f23661f;
    public final org.telegram.ui.Components.b5 h;

    public int f23662n;

    public final org.telegram.ui.Components.b5 f23663r;

    public boolean f23664s;
    public final org.telegram.ui.Components.y5 v;

    public int f23665w;

    public boolean f23666x;

    public boolean f23667y;

    public m3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f23657a = new Paint(1);
        this.f23658b = true;
        this.f23659c = false;
        er erVar = er.h;
        this.h = new org.telegram.ui.Components.b5(this, 200L, erVar, 0);
        this.f23663r = new org.telegram.ui.Components.b5(this, 200L, erVar, 0);
        this.v = new org.telegram.ui.Components.y5(this, 0L, 200L, erVar);
        this.f23665w = UserConfig.selectedAccount;
        this.A = new RectF();
        this.E = new HashSet();
        this.F = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(g6.w0(null, g6.f22999a7, false));
        k3 k3Var = new k3(this, this);
        this.f23660e = k3Var;
        r0.j0.k(this, k3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (I == null) {
            TextPaint textPaint = new TextPaint(1);
            I = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            I.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return I;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(35);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf + 1) : str;
    }

    public final void b() {
        ValueAnimator valueAnimator;
        ArrayList<l3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        l3 l3Var = (l3) i0.a.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.C1;
        v3 v3Var = launchActivity == null ? null : launchActivity.f35537u0;
        if (v3Var != null && (valueAnimator = v3Var.d) != null) {
            valueAnimator.cancel();
            v3Var.d = null;
        }
        if (size == 1 || v3Var == null) {
            e(l3Var);
        } else {
            v3Var.f();
        }
    }

    public final j3 c(l3 l3Var) {
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f23528a == l3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f10) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f10);
        float fLerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f10));
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f11 = (fWidth / 2.0f) * fLerp;
        rectF.left = fCenterX - f11;
        rectF.right = fCenterX + f11;
        float f12 = (fHeight / 2.0f) * fLerp;
        rectF.top = fCenterY - f12;
        rectF.bottom = fCenterY + f12;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.C <= 0.0f) {
            return;
        }
        this.f23657a.setColor(this.h.a(this.f23661f, false));
        super.dispatchDraw(canvas);
        int iA = this.f23663r.a(this.f23662n, false);
        float fE = this.v.e(this.f23664s);
        if (this.f23658b) {
            int i10 = 0;
            while (i10 < tabDrawables.size()) {
                j3 j3Var = tabDrawables.get(i10);
                float fC = j3Var.c();
                float fB = j3Var.b();
                if (fB > 0.0f && fC <= 1.99f) {
                    RectF rectF = this.A;
                    d(rectF, fC);
                    j3Var.v = 0.0f;
                    boolean z10 = fE > 0.5f;
                    j3Var.f23537l = iA;
                    j3Var.f23539n = z10;
                    canvas2 = canvas;
                    j3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), fB, 1.0f);
                } else {
                    canvas2 = canvas;
                }
                i10++;
                canvas = canvas2;
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        k3 k3Var;
        if (!this.f23658b || getTabs().isEmpty() || (k3Var = this.f23660e) == null || !k3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(l3 l3Var) {
        rn rnVar;
        ck ckVar;
        n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null || n2VarR.getParentActivity() == null) {
            return;
        }
        boolean z10 = n2VarR instanceof rn;
        if (z10 && (ckVar = (rnVar = (rn) n2VarR).U) != null) {
            ckVar.P();
            rnVar.U.n0(true, false, true);
        }
        if (l3Var.H == null) {
            new gh.d1(25, this, l3Var).run(n2VarR);
            if (l3Var.A) {
                if (z10 && ((rn) n2VarR).a() == l3Var.f23623a.f18907c) {
                    return;
                }
                this.f23659c = true;
                AndroidUtilities.runOnUIThread(new i3((Object) this, (Object) n2VarR, (Object) rn.R9(l3Var.f23623a.f18907c), 0), 220L);
                return;
            }
            return;
        }
        n2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.m4 m4Var = l3Var.H;
        org.telegram.ui.z3 z3Var = m4Var.G;
        h3.b(z3Var);
        sheetFragment.addSheet(z3Var);
        org.telegram.ui.y3 y3Var = z3Var.f45005c;
        z3Var.h = false;
        z3Var.f45008n = false;
        ValueAnimator valueAnimator = z3Var.f45013y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = z3Var.A;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        z3Var.f45012x = 0.0f;
        z3Var.f45011w = 0.0f;
        z3Var.h();
        z3Var.n();
        y3Var.invalidate();
        y3Var.requestLayout();
        m4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
        z3Var.g(sheetFragment);
        z3Var.f();
        h(this.f23665w, l3Var, false);
    }

    public final void f() {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).f23530c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(l3 l3Var, Utilities.Callback callback) {
        if (l3Var == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!l3Var.f23642w) {
            h(this.f23665w, l3Var, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(l3Var.f23623a.f18905a).getUser(Long.valueOf(l3Var.f23623a.f18907c));
        String name = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = name;
        b2Var.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, l3Var, callback, b2VarArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ag.l0(zArr, callback, b2VarArr, 15));
        b2[] b2VarArr = {b2Var};
        b2Var.setOnDismissListener(new h7(zArr, callback));
        b2VarArr[0].show();
        ((TextView) b2VarArr[0].d(-1)).setTextColor(g6.w0(null, g6.f23284q7, false));
    }

    public Paint getBackgroundPaint() {
        return this.f23657a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        return size == 1 ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(68.0f);
    }

    public ArrayList<j3> getTabDrawables() {
        int i10 = this.f23665w;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = H;
        ArrayList<j3> arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer numValueOf2 = Integer.valueOf(i10);
        ArrayList<j3> arrayList2 = new ArrayList<>();
        map.put(numValueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<l3> getTabs() {
        int i10 = this.f23665w;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = G;
        ArrayList<l3> arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer numValueOf2 = Integer.valueOf(i10);
        ArrayList<l3> arrayList2 = new ArrayList<>();
        map.put(numValueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i10, l3 l3Var, boolean z10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = G;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList == null) {
            Integer numValueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            map.put(numValueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer numValueOf3 = Integer.valueOf(i10);
        HashMap map2 = H;
        ArrayList arrayList3 = (ArrayList) map2.get(numValueOf3);
        if (arrayList3 == null) {
            Integer numValueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            map2.put(numValueOf4, arrayList3);
        }
        arrayList.remove(l3Var);
        if (z10) {
            l3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            j3 j3Var = (j3) arrayList3.get(i11);
            int iIndexOf = arrayList.indexOf(j3Var.f23528a);
            j3Var.f23530c = iIndexOf;
            if (iIndexOf >= 0) {
                j3Var.f23529b = iIndexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new i3(this, arrayList3, l3Var, 1), 320L);
        o(true);
        invalidate();
        k3 k3Var = this.f23660e;
        if (k3Var != null) {
            k3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        if (i10 != this.f23661f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.M || actionBarLayout.P) {
                z10 = false;
            }
            this.f23661f = i10;
            int iV = g6.v(i10, g6.l1((AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
            this.f23662n = iV;
            this.f23664s = AndroidUtilities.computePerceivedBrightness(iV) < 0.721f;
            if (!z10) {
                this.h.a(this.f23661f, true);
                this.f23663r.a(this.f23662n, true);
                this.v.f(this.f23664s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i10) {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.f23658b) {
            l3 l3Var = tabs.isEmpty() ? null : tabs.get(0);
            j3 j3VarC = c(l3Var);
            if (j3VarC != null) {
                org.telegram.ui.Cells.z zVar = j3VarC.f23536k;
                float fC = j3VarC.c();
                RectF rectF = this.A;
                d(rectF, fC);
                if (i10 == 0 || i10 == 2) {
                    boolean zContains = zVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f23666x = zContains;
                    this.f23667y = !zContains && rectF.contains(f10, f11);
                    zVar.setState(this.f23666x ? new int[]{16842919, 16842910} : new int[0]);
                } else if (i10 == 1 || i10 == 3) {
                    if (this.f23667y && i10 == 1) {
                        b();
                    } else if (this.f23666x && i10 == 1) {
                        g(l3Var, new cg.h(1));
                    }
                    this.f23666x = false;
                    this.f23667y = false;
                    zVar.setState(new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != j3VarC) {
                        tabDrawables.get(i11).f23536k.setState(new int[0]);
                    }
                }
            } else {
                this.f23667y = false;
                this.f23666x = false;
            }
        } else {
            this.f23667y = false;
            this.f23666x = false;
        }
        return this.f23667y || this.f23666x;
    }

    public final l3 k(nh.q4 q4Var) {
        Integer numValueOf = Integer.valueOf(this.f23665w);
        HashMap map = G;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList == null) {
            Integer numValueOf2 = Integer.valueOf(this.f23665w);
            ArrayList arrayList2 = new ArrayList();
            map.put(numValueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l3 l3Var = (l3) arrayList.get(i10);
            if (q4Var.equals(l3Var.f23623a)) {
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
            org.telegram.ui.m4 m4Var = l3Var.H;
            if (m4Var != null && !m4Var.Z.isEmpty()) {
                Object objI = i0.a.i(1, l3Var.H.Z);
                if ((objI instanceof TLRPC.WebPage) && ((TLRPC.WebPage) objI).f22533id == webPage.f22533id) {
                    e(l3Var);
                    return l3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence charSequenceReplaceEmoji;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            j3 j3Var = tabDrawables.get(i10);
            if (tabs.size() <= 1 || j3Var.f23529b != 0) {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(j3Var.f23528a.b(), getTextPaint().getFontMetricsInt(), false);
                j3Var.f23546u = null;
            } else {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, j3Var.f23528a.b()), getTextPaint().getFontMetricsInt(), false);
                if (charSequenceReplaceEmoji == null) {
                    j3Var.f23546u = null;
                } else {
                    j3Var.f23546u = new pz0(charSequenceReplaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            }
            charSequence = charSequenceReplaceEmoji;
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
        if (this.D == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            this.B = null;
            valueAnimator.cancel();
        }
        this.D = getExpandedHeight();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.C, this.D);
            this.B = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new w0(this, 4));
            this.B.addListener(new h(this, 3));
            this.B.setDuration(250L);
            this.B.setInterpolator(p1.f23706w);
            this.B.start();
        } else {
            this.C = this.D;
            invalidate();
        }
        Object parent = getParent();
        if (parent instanceof View) {
            WeakHashMap weakHashMap = r0.j0.f46605a;
            r0.z.c((View) parent);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) || super.onTouchEvent(motionEvent);
    }

    public void setCurrentAccount(int i10) {
        if (this.f23665w != i10) {
            this.f23665w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(j3 j3Var) {
        int iA = this.f23663r.a(this.f23662n, false);
        float fE = this.v.e(this.f23664s);
        j3Var.v = 0.0f;
        boolean z10 = fE > 0.5f;
        j3Var.f23537l = iA;
        j3Var.f23539n = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
