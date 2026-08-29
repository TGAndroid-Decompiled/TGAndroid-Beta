package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xp;
import org.telegram.ui.mz0;
public abstract class e6 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f24293a;
    public final TextView f24294b;
    public final xp f24295c;
    public final p2 d;
    public boolean f24296e;
    public final org.telegram.ui.Components.d6 f24297f;
    public final c90 h;
    public boolean f24298n;

    public e6(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getContext());
        jr jrVar = jr.h;
        this.f24297f = new org.telegram.ui.Components.d6(320L, jrVar);
        this.f24298n = false;
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = o2Var.getResourceProvider();
        this.f24293a = resourceProvider;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        addView(g10, i7.f6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f24294b = textView;
        org.telegram.ui.b.g(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        g10.addView(textView, i7.f6.q(-2, -2, 51));
        xp xpVar = new xp(context);
        this.f24295c = xpVar;
        xpVar.getDrawable().o(true, true, false);
        xpVar.b(0.3f, 165L, jrVar);
        xpVar.setTypeface(AndroidUtilities.bold());
        xpVar.setTextSize(AndroidUtilities.dp(11.0f));
        xpVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        xpVar.setGravity(3);
        g10.addView(xpVar, i7.f6.t(-1, 17, 51, 4, 1, 4, 0));
        p2 p2Var = new p2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = p2Var;
        p2Var.setBackgroundColor(0);
        p2Var.setDialogCellDelegate(new b6((mz0) this, o2Var, context));
        p2Var.D = 15;
        p2Var.E = 83;
        addView(p2Var, i7.f6.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        c90 c90Var = new c90();
        this.h = c90Var;
        int i10 = org.telegram.ui.ActionBar.g6.f23152i6;
        c90Var.e(org.telegram.ui.ActionBar.g6.l1(1.25f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)));
        c90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f9;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f24298n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        xp xpVar = this.f24295c;
        xpVar.a();
        float f12 = 0.0f;
        xpVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = xpVar.animate();
            if (z10) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f13 = 0.8f;
            }
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(jr.h).start();
        } else {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            xpVar.setAlpha(f9);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            xpVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            xpVar.setScaleY(f12);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i10 = chat.participants_count;
                iArr[0] = i10;
                formatShortNumber = String.valueOf(i10);
            } else {
                formatShortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            xpVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f24296e = z11;
            p2 p2Var = this.d;
            if (z11) {
                p2Var.W(-chat.f22392id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
                long j10 = -chat.f22392id;
                int i11 = messageObject.messageOwner.date;
                if (p2Var.D0 != j10) {
                    p2Var.f24905p4 = -1;
                }
                p2Var.D0 = j10;
                p2Var.f24927t4 = System.currentTimeMillis();
                p2Var.f24833b1 = messageObject;
                p2Var.f24908q2 = false;
                p2Var.J0 = false;
                p2Var.N0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                p2Var.O0 = 0;
                p2Var.P0 = false;
                p2Var.f24863h1 = messageObject.getId();
                p2Var.Q0 = 0;
                p2Var.R0 = 0;
                p2Var.S0 = 0;
                p2Var.T0 = messageObject.isUnread();
                p2Var.f24838c1 = arrayList;
                MessageObject messageObject2 = p2Var.f24833b1;
                if (messageObject2 != null) {
                    p2Var.U0 = messageObject2.messageOwner.send_state;
                }
                p2Var.b0(0, z12);
            }
        }
        if (!z12) {
            this.f24297f.f(this.f24296e, true);
        }
        invalidate();
        this.f24298n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e10 = this.f24297f.e(this.f24296e);
        if (e10 > 0.0f) {
            c90 c90Var = this.h;
            c90Var.setAlpha((int) (e10 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.d;
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(46.33f));
            c90Var.d(rectF);
            c90Var.draw(canvas);
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(64.33f));
            c90Var.d(rectF);
            c90Var.draw(canvas);
            rectF.set(((p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), p2Var.getY() + AndroidUtilities.dp(12.0f), (p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f), p2Var.getY() + AndroidUtilities.dp(20.33f));
            c90Var.d(rectF);
            c90Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.f24293a);
        xp xpVar = this.f24295c;
        xpVar.setTextColor(v02);
        xpVar.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.g6.l1(0.1f, v02)));
        this.f24294b.setTextColor(v02);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
