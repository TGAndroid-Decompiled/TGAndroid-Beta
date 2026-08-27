package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.t80;
import org.telegram.ui.mz0;

public abstract class d6 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final org.telegram.ui.ActionBar.c6 f24220a;

    public final TextView f24221b;

    public final rp f24222c;
    public final p2 d;

    public boolean f24223e;

    public final org.telegram.ui.Components.y5 f24224f;
    public final t80 h;

    public boolean f24225n;

    public d6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        er erVar = er.h;
        this.f24224f = new org.telegram.ui.Components.y5(320L, erVar);
        this.f24225n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
        this.f24220a = resourceProvider;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        addView(linearLayoutG, h7.z5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f24221b = textView;
        rl.h(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        linearLayoutG.addView(textView, h7.z5.q(-2, -2, 51));
        rp rpVar = new rp(context);
        this.f24222c = rpVar;
        rpVar.getDrawable().o(true, true, false);
        rpVar.b(0.3f, 165L, erVar);
        rpVar.setTypeface(AndroidUtilities.bold());
        rpVar.setTextSize(AndroidUtilities.dp(11.0f));
        rpVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        rpVar.setGravity(3);
        linearLayoutG.addView(rpVar, h7.z5.t(-1, 17, 51, 4, 1, 4, 0));
        p2 p2Var = new p2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = p2Var;
        p2Var.setBackgroundColor(0);
        p2Var.setDialogCellDelegate(new a6((mz0) this, n2Var, context));
        p2Var.D = 15;
        p2Var.E = 83;
        addView(p2Var, h7.z5.e(-1, -2, 87));
        d();
        setWillNotDraw(false);
        t80 t80Var = new t80();
        this.h = t80Var;
        int i10 = org.telegram.ui.ActionBar.g6.f23144i6;
        t80Var.e(org.telegram.ui.ActionBar.g6.l1(1.25f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)));
        t80Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String shortNumber;
        boolean z10 = this.f24225n;
        boolean z11 = chat == null || chat.participants_count > 0;
        rp rpVar = this.f24222c;
        rpVar.a();
        rpVar.setPivotX(0.0f);
        if (z10) {
            rpVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(er.h).start();
        } else {
            rpVar.setAlpha(z11 ? 1.0f : 0.0f);
            rpVar.setScaleX(z11 ? 1.0f : 0.0f);
            rpVar.setScaleY(z11 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i10 = chat.participants_count;
                iArr[0] = i10;
                shortNumber = String.valueOf(i10);
            } else {
                shortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            rpVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.f24223e = z12;
            p2 p2Var = this.d;
            if (z12) {
                p2Var.W(-chat.f22380id, null, 0, false, z10);
            } else {
                MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList);
                long j10 = -chat.f22380id;
                int i11 = messageObject.messageOwner.date;
                if (p2Var.D0 != j10) {
                    p2Var.f24914p4 = -1;
                }
                p2Var.D0 = j10;
                p2Var.f24936t4 = System.currentTimeMillis();
                p2Var.f24841b1 = messageObject;
                p2Var.f24917q2 = false;
                p2Var.J0 = false;
                p2Var.N0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                p2Var.O0 = 0;
                p2Var.P0 = false;
                p2Var.f24872h1 = messageObject.getId();
                p2Var.Q0 = 0;
                p2Var.R0 = 0;
                p2Var.S0 = 0;
                p2Var.T0 = messageObject.isUnread();
                p2Var.f24846c1 = arrayList;
                MessageObject messageObject2 = p2Var.f24841b1;
                if (messageObject2 != null) {
                    p2Var.U0 = messageObject2.messageOwner.send_state;
                }
                p2Var.b0(0, z10);
            }
        }
        if (!z10) {
            this.f24224f.f(this.f24223e, true);
        }
        invalidate();
        this.f24225n = true;
    }

    @Override
    public final void d() {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.f24220a);
        rp rpVar = this.f24222c;
        rpVar.setTextColor(iV0);
        rpVar.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.g6.l1(0.1f, iV0)));
        this.f24221b.setTextColor(iV0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float fE = this.f24224f.e(this.f24223e);
        if (fE > 0.0f) {
            t80 t80Var = this.h;
            t80Var.setAlpha((int) (fE * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.d;
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(46.33f));
            t80Var.d(rectF);
            t80Var.draw(canvas);
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(64.33f));
            t80Var.d(rectF);
            t80Var.draw(canvas);
            rectF.set(((p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), p2Var.getY() + AndroidUtilities.dp(12.0f), (p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f), p2Var.getY() + AndroidUtilities.dp(20.33f));
            t80Var.d(rectF);
            t80Var.draw(canvas);
            invalidate();
        }
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
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
