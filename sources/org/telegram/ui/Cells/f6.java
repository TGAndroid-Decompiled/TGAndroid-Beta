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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.e01;
public abstract class f6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f21033a;
    public final TextView f21034b;
    public final aq f21035c;
    public final q2 d;
    public boolean e;
    public final org.telegram.ui.Components.z5 f21036f;
    public final j90 h;
    public boolean f21037n;

    public f6(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getContext());
        mr mrVar = mr.h;
        this.f21036f = new org.telegram.ui.Components.z5(320L, mrVar);
        this.f21037n = false;
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        this.f21033a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, k7.b6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f21034b = textView;
        org.telegram.ui.b.g(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f10.addView(textView, k7.b6.q(-2, -2, 51));
        aq aqVar = new aq(context);
        this.f21035c = aqVar;
        aqVar.getDrawable().o(true, true, false);
        aqVar.b(0.3f, 165L, mrVar);
        aqVar.setTypeface(AndroidUtilities.bold());
        aqVar.setTextSize(AndroidUtilities.dp(11.0f));
        aqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        aqVar.setGravity(3);
        f10.addView(aqVar, k7.b6.t(-1, 17, 51, 4, 1, 4, 0));
        q2 q2Var = new q2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = q2Var;
        q2Var.setBackgroundColor(0);
        q2Var.setDialogCellDelegate(new c6((e01) this, p2Var, context));
        q2Var.E = 15;
        q2Var.F = 83;
        addView(q2Var, k7.b6.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        j90 j90Var = new j90();
        this.h = j90Var;
        int i10 = org.telegram.ui.ActionBar.j6.f19971i6;
        j90Var.e(org.telegram.ui.ActionBar.j6.l1(1.25f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)));
        j90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z4;
        float f10;
        float f11;
        String formatShortNumber;
        boolean z10;
        float f12;
        boolean z11 = this.f21037n;
        if (chat != null && chat.participants_count <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        aq aqVar = this.f21035c;
        aqVar.a();
        float f13 = 0.0f;
        aqVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z11) {
            ViewPropertyAnimator animate = aqVar.animate();
            if (z4) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f13);
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (!z4) {
                f14 = 0.8f;
            }
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(mr.h).start();
        } else {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            aqVar.setAlpha(f10);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            aqVar.setScaleX(f11);
            if (z4) {
                f13 = 1.0f;
            }
            aqVar.setScaleY(f13);
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
            aqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.e = z10;
            q2 q2Var = this.d;
            if (z10) {
                q2Var.W(-chat.f19159id, null, 0, false, z11);
            } else {
                MessageObject messageObject = (MessageObject) kf.k0.i(1, arrayList);
                long j10 = -chat.f19159id;
                int i11 = messageObject.messageOwner.date;
                if (q2Var.E0 != j10) {
                    q2Var.f21635q4 = -1;
                }
                q2Var.E0 = j10;
                q2Var.f21657u4 = System.currentTimeMillis();
                q2Var.f21563c1 = messageObject;
                q2Var.f21639r2 = false;
                q2Var.K0 = false;
                q2Var.O0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                q2Var.P0 = 0;
                q2Var.Q0 = false;
                q2Var.f21593i1 = messageObject.getId();
                q2Var.R0 = 0;
                q2Var.S0 = 0;
                q2Var.T0 = 0;
                q2Var.U0 = messageObject.isUnread();
                q2Var.f21567d1 = arrayList;
                MessageObject messageObject2 = q2Var.f21563c1;
                if (messageObject2 != null) {
                    q2Var.V0 = messageObject2.messageOwner.send_state;
                }
                q2Var.b0(0, z11);
            }
        }
        if (!z11) {
            this.f21036f.f(this.e, true);
        }
        invalidate();
        this.f21037n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f21036f.e(this.e);
        if (e > 0.0f) {
            j90 j90Var = this.h;
            j90Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            q2 q2Var = this.d;
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(46.33f));
            j90Var.d(rectF);
            j90Var.draw(canvas);
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(64.33f));
            j90Var.d(rectF);
            j90Var.draw(canvas);
            rectF.set(((q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), q2Var.getY() + AndroidUtilities.dp(12.0f), (q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f), q2Var.getY() + AndroidUtilities.dp(20.33f));
            j90Var.d(rectF);
            j90Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.f21033a);
        aq aqVar = this.f21035c;
        aqVar.setTextColor(v02);
        aqVar.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.j6.l1(0.1f, v02)));
        this.f21034b.setTextColor(v02);
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
