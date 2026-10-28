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
import bi.m9;
import bi.p7;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.ry;
import org.telegram.ui.wn;
public final class s3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint f23073a;
    public boolean f23074b;
    public boolean f23075c;
    public final ActionBarLayout d;
    public final q3 e;
    public int f23076f;
    public final org.telegram.ui.Components.j5 h;
    public int f23077n;
    public final org.telegram.ui.Components.j5 f23078r;
    public boolean f23079s;
    public final org.telegram.ui.Components.h6 v;
    public int f23080w;
    public boolean f23081x;
    public boolean f23082y;

    public s3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f23073a = new Paint(1);
        this.f23074b = true;
        this.f23075c = false;
        ds dsVar = ds.h;
        this.h = new org.telegram.ui.Components.j5(this, 200L, dsVar, 0);
        this.f23078r = new org.telegram.ui.Components.j5(this, 200L, dsVar, 0);
        this.v = new org.telegram.ui.Components.h6(this, 0L, 200L, dsVar);
        this.f23080w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(y6.x0(null, y6.f23300a7, false));
        q3 q3Var = new q3(this, this);
        this.e = q3Var;
        r0.i0.k(this, q3Var);
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
        b4 b4Var;
        ValueAnimator valueAnimator;
        ArrayList<r3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        r3 r3Var = (r3) ic.a.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            b4Var = null;
        } else {
            b4Var = launchActivity.f35593y0;
        }
        if (b4Var != null && (valueAnimator = b4Var.d) != null) {
            valueAnimator.cancel();
            b4Var.d = null;
        }
        if (size != 1 && b4Var != null) {
            b4Var.f();
        } else {
            e(r3Var);
        }
    }

    public final p3 c(r3 r3Var) {
        ArrayList<p3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f22932a == r3Var) {
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
        ArrayList<p3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f23073a.setColor(this.h.a(this.f23076f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f23078r.a(this.f23077n, false);
            float e = this.v.e(this.f23079s);
            if (this.f23074b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    p3 p3Var = tabDrawables.get(i10);
                    float c10 = p3Var.c();
                    float b10 = p3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        p3Var.f22950w = 0.0f;
                        if (e > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        p3Var.f22941m = a2;
                        p3Var.f22943o = z10;
                        canvas2 = canvas;
                        p3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        q3 q3Var;
        if (this.f23074b && !getTabs().isEmpty() && (q3Var = this.e) != null && q3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(r3 r3Var) {
        wn wnVar;
        jk jkVar;
        r2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof wn;
            if (z10 && (jkVar = (wnVar = (wn) R).Y) != null) {
                jkVar.L();
                wnVar.Y.j0(true, false, true);
            }
            if (r3Var.J != null) {
                ry sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.j4 j4Var = r3Var.J;
                org.telegram.ui.v3 v3Var = j4Var.K;
                o3.b(v3Var);
                sheetFragment.addSheet(v3Var);
                org.telegram.ui.u3 u3Var = v3Var.f44168c;
                v3Var.h = false;
                v3Var.f44170n = false;
                ValueAnimator valueAnimator = v3Var.f44175y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = v3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                v3Var.f44174x = 0.0f;
                v3Var.f44173w = 0.0f;
                v3Var.h();
                v3Var.n();
                u3Var.invalidate();
                u3Var.requestLayout();
                j4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                v3Var.g(sheetFragment);
                v3Var.f();
                h(this.f23080w, r3Var, false);
                return;
            }
            new li.s2(2, this, r3Var).run(R);
            if (r3Var.C) {
                if (!z10 || ((wn) R).a() != r3Var.f23005a.f12916c) {
                    this.f23075c = true;
                    AndroidUtilities.runOnUIThread(new jg.f1(this, R, wn.ea(r3Var.f23005a.f12916c), 21), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<r3> tabs = getTabs();
        ArrayList<p3> tabDrawables = getTabDrawables();
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

    public final void g(r3 r3Var, Utilities.Callback callback) {
        String str;
        if (r3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!r3Var.f23025y) {
            h(this.f23080w, r3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(r3Var.f23005a.f12914a).getUser(Long.valueOf(r3Var.f23005a.f12916c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                hi.c5 c5Var = r3Var.f23005a;
                if (c5Var.f12918g == 6) {
                    str = c5Var.e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = str;
            e2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new p7(this, zArr, r3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 17));
            e2[] e2VarArr = {e2Var};
            e2Var.setOnDismissListener(new m9(zArr, callback));
            e2VarArr[0].show();
            f7.V((TextView) e2VarArr[0].d(-1), y6.f23599q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f23073a;
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

    public ArrayList<p3> getTabDrawables() {
        int i10 = this.f23080w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<p3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<p3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<r3> getTabs() {
        int i10 = this.f23080w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<r3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<r3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, r3 r3Var, boolean z10) {
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
        arrayList.remove(r3Var);
        if (z10) {
            r3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            p3 p3Var = (p3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(p3Var.f22932a);
            p3Var.d = indexOf;
            if (indexOf >= 0) {
                p3Var.f22934c = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new jg.f1(this, arrayList3, r3Var, 22), 320L);
        o(true);
        invalidate();
        q3 q3Var = this.e;
        if (q3Var != null) {
            q3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f23076f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z10 = false;
            }
            this.f23076f = i10;
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
            int v = y6.v(i10, y6.o1(f7, -1));
            this.f23077n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f23079s = z12;
            if (!z10) {
                this.h.a(this.f23076f, true);
                this.f23078r.a(this.f23077n, true);
                this.v.f(this.f23079s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        r3 r3Var;
        boolean z10;
        ArrayList<r3> tabs = getTabs();
        ArrayList<p3> tabDrawables = getTabDrawables();
        if (this.f23074b) {
            if (tabs.isEmpty()) {
                r3Var = null;
            } else {
                r3Var = tabs.get(0);
            }
            p3 c10 = c(r3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.f22940l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f23082y && i10 == 1) {
                            b();
                        } else if (this.f23081x && i10 == 1) {
                            g(r3Var, new di.e(6));
                        }
                        this.f23081x = false;
                        this.f23082y = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f23081x = contains;
                    if (!contains && rectF.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f23082y = z10;
                    yVar.setState(this.f23081x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).f22940l.setState(new int[0]);
                    }
                }
            } else {
                this.f23082y = false;
                this.f23081x = false;
            }
        } else {
            this.f23082y = false;
            this.f23081x = false;
        }
        if (this.f23082y || this.f23081x) {
            return true;
        }
        return false;
    }

    public final r3 k(hi.c5 c5Var) {
        Integer valueOf = Integer.valueOf(this.f23080w);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f23080w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r3 r3Var = (r3) arrayList.get(i10);
            if (c5Var.equals(r3Var.f23005a)) {
                e(r3Var);
                return r3Var;
            }
        }
        return null;
    }

    public final r3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final r3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<r3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            r3 r3Var = tabs.get(i10);
            org.telegram.ui.j4 j4Var = r3Var.J;
            if (j4Var != null && !j4Var.f40398d0.isEmpty()) {
                Object g7 = ic.a.g(1, r3Var.J.f40398d0);
                if ((g7 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g7).f22183id == webPage.f22183id) {
                    e(r3Var);
                    return r3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<r3> tabs = getTabs();
        ArrayList<p3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            p3 p3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && p3Var.f22934c == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, p3Var.f22932a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    p3Var.v = null;
                } else {
                    p3Var.v = new r11(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(p3Var.f22932a.b(), getTextPaint().getFontMetricsInt(), false);
                p3Var.v = null;
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
                this.F.setInterpolator(q1.f22964w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f47143a;
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
        if (this.f23080w != i10) {
            this.f23080w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(p3 p3Var) {
        boolean z10 = false;
        int a2 = this.f23078r.a(this.f23077n, false);
        float e = this.v.e(this.f23079s);
        p3Var.f22950w = 0.0f;
        if (e > 0.5f) {
            z10 = true;
        }
        p3Var.f22941m = a2;
        p3Var.f22943o = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
