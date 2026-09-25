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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.h01;
public abstract class h6 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f20399a;
    public final TextView f20400b;
    public final eq f20401c;
    public final s2 d;
    public boolean e;
    public final org.telegram.ui.Components.e6 f20402f;
    public final r90 h;
    public boolean f20403n;

    public h6(org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getContext());
        rr rrVar = rr.h;
        this.f20402f = new org.telegram.ui.Components.e6(320L, rrVar);
        this.f20403n = false;
        Context context = m2Var.getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = m2Var.getResourceProvider();
        this.f20399a = resourceProvider;
        LinearLayout f7 = ok.f(context, 0);
        addView(f7, w7.y5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f20400b = textView;
        ok.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f7.addView(textView, w7.y5.q(-2, -2, 51));
        eq eqVar = new eq(context);
        this.f20401c = eqVar;
        eqVar.getDrawable().o(true, true, false);
        eqVar.b(0.3f, 165L, rrVar);
        eqVar.setTypeface(AndroidUtilities.bold());
        eqVar.setTextSize(AndroidUtilities.dp(11.0f));
        eqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        eqVar.setGravity(3);
        f7.addView(eqVar, w7.y5.t(-1, 17, 51, 4, 1, 4, 0));
        s2 s2Var = new s2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = s2Var;
        s2Var.setBackgroundColor(0);
        s2Var.setDialogCellDelegate(new e6((h01) this, m2Var, context));
        s2Var.H = 15;
        s2Var.I = 83;
        addView(s2Var, w7.y5.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        r90 r90Var = new r90();
        this.h = r90Var;
        int i10 = org.telegram.ui.ActionBar.h6.f19149i6;
        r90Var.e(org.telegram.ui.ActionBar.h6.l1(1.25f, org.telegram.ui.ActionBar.h6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.h6.l1(0.8f, org.telegram.ui.ActionBar.h6.v0(i10, resourceProvider)));
        r90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f20403n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        eq eqVar = this.f20401c;
        eqVar.a();
        float f12 = 0.0f;
        eqVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = eqVar.animate();
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
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(rr.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            eqVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            eqVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            eqVar.setScaleY(f12);
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
            eqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.e = z11;
            s2 s2Var = this.d;
            if (z11) {
                s2Var.W(-chat.f18336id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
                long j3 = -chat.f18336id;
                int i11 = messageObject.messageOwner.date;
                if (s2Var.H0 != j3) {
                    s2Var.f21020t4 = -1;
                }
                s2Var.H0 = j3;
                s2Var.f21042x4 = System.currentTimeMillis();
                s2Var.f20948f1 = messageObject;
                s2Var.f21023u2 = false;
                s2Var.N0 = false;
                s2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                s2Var.S0 = 0;
                s2Var.T0 = false;
                s2Var.l1 = messageObject.getId();
                s2Var.U0 = 0;
                s2Var.V0 = 0;
                s2Var.W0 = 0;
                s2Var.X0 = messageObject.isUnread();
                s2Var.f20953g1 = arrayList;
                MessageObject messageObject2 = s2Var.f20948f1;
                if (messageObject2 != null) {
                    s2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                s2Var.b0(0, z12);
            }
        }
        if (!z12) {
            this.f20402f.f(this.e, true);
        }
        invalidate();
        this.f20403n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f20402f.e(this.e);
        if (e > 0.0f) {
            r90 r90Var = this.h;
            r90Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            s2 s2Var = this.d;
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(46.33f));
            r90Var.d(rectF);
            r90Var.draw(canvas);
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(64.33f));
            r90Var.d(rectF);
            r90Var.draw(canvas);
            rectF.set(((s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), s2Var.getY() + AndroidUtilities.dp(12.0f), (s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f), s2Var.getY() + AndroidUtilities.dp(20.33f));
            r90Var.d(rectF);
            r90Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, this.f20399a);
        eq eqVar = this.f20401c;
        eqVar.setTextColor(v02);
        eqVar.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.l1(0.1f, v02)));
        this.f20400b.setTextColor(v02);
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
