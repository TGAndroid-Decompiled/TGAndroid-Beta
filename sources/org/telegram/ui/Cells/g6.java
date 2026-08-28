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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tp;
import org.telegram.ui.mz0;
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 f24397a;
    public final TextView f24398b;
    public final tp f24399c;
    public final r2 d;
    public boolean f24400e;
    public final org.telegram.ui.Components.y5 f24401f;
    public final p80 h;
    public boolean f24402n;

    public g6(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getContext());
        gr grVar = gr.h;
        this.f24401f = new org.telegram.ui.Components.y5(320L, grVar);
        this.f24402n = false;
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.b6 resourceProvider = o2Var.getResourceProvider();
        this.f24397a = resourceProvider;
        LinearLayout f10 = ll.f(context, 0);
        addView(f10, g7.e6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f24398b = textView;
        ll.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f10.addView(textView, g7.e6.q(-2, -2, 51));
        tp tpVar = new tp(context);
        this.f24399c = tpVar;
        tpVar.getDrawable().o(true, true, false);
        tpVar.b(0.3f, 165L, grVar);
        tpVar.setTypeface(AndroidUtilities.bold());
        tpVar.setTextSize(AndroidUtilities.dp(11.0f));
        tpVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        tpVar.setGravity(3);
        f10.addView(tpVar, g7.e6.t(-1, 17, 51, 4, 1, 4, 0));
        r2 r2Var = new r2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = r2Var;
        r2Var.setBackgroundColor(0);
        r2Var.setDialogCellDelegate(new d6((mz0) this, o2Var, context));
        r2Var.D = 15;
        r2Var.E = 83;
        addView(r2Var, g7.e6.e(-1, -2, 87));
        d();
        setWillNotDraw(false);
        p80 p80Var = new p80();
        this.h = p80Var;
        int i9 = org.telegram.ui.ActionBar.f6.f23092i6;
        p80Var.e(org.telegram.ui.ActionBar.f6.l1(1.25f, org.telegram.ui.ActionBar.f6.v0(i9, resourceProvider)), org.telegram.ui.ActionBar.f6.l1(0.8f, org.telegram.ui.ActionBar.f6.v0(i9, resourceProvider)));
        p80Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f10;
        float f11;
        String formatShortNumber;
        boolean z11;
        float f12;
        boolean z12 = this.f24402n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        tp tpVar = this.f24399c;
        tpVar.a();
        float f13 = 0.0f;
        tpVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = tpVar.animate();
            if (z10) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f13);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (!z10) {
                f14 = 0.8f;
            }
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(gr.h).start();
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            tpVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            tpVar.setScaleX(f11);
            if (z10) {
                f13 = 1.0f;
            }
            tpVar.setScaleY(f13);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i9 = chat.participants_count;
                iArr[0] = i9;
                formatShortNumber = String.valueOf(i9);
            } else {
                formatShortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            tpVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f24400e = z11;
            r2 r2Var = this.d;
            if (z11) {
                r2Var.V(-chat.f22380id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                long j10 = -chat.f22380id;
                int i10 = messageObject.messageOwner.date;
                if (r2Var.D0 != j10) {
                    r2Var.f25031p4 = -1;
                }
                r2Var.D0 = j10;
                r2Var.f25053t4 = System.currentTimeMillis();
                r2Var.f24958b1 = messageObject;
                r2Var.f25034q2 = false;
                r2Var.J0 = false;
                r2Var.N0 = i10;
                int i11 = messageObject.messageOwner.edit_date;
                r2Var.O0 = 0;
                r2Var.P0 = false;
                r2Var.f24989h1 = messageObject.getId();
                r2Var.Q0 = 0;
                r2Var.R0 = 0;
                r2Var.S0 = 0;
                r2Var.T0 = messageObject.isUnread();
                r2Var.f24963c1 = arrayList;
                MessageObject messageObject2 = r2Var.f24958b1;
                if (messageObject2 != null) {
                    r2Var.U0 = messageObject2.messageOwner.send_state;
                }
                r2Var.a0(0, z12);
            }
        }
        if (!z12) {
            this.f24401f.f(this.f24400e, true);
        }
        invalidate();
        this.f24402n = true;
    }

    @Override
    public final void d() {
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, this.f24397a);
        tp tpVar = this.f24399c;
        tpVar.setTextColor(v02);
        tpVar.setBackground(org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.f6.l1(0.1f, v02)));
        this.f24398b.setTextColor(v02);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e10 = this.f24401f.e(this.f24400e);
        if (e10 > 0.0f) {
            p80 p80Var = this.h;
            p80Var.setAlpha((int) (e10 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            r2 r2Var = this.d;
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.E + 6), r2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + r2Var.getX() + AndroidUtilities.dp(r2Var.E + 6), r2Var.getY() + AndroidUtilities.dp(46.33f));
            p80Var.d(rectF);
            p80Var.draw(canvas);
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.E + 6), r2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + r2Var.getX() + AndroidUtilities.dp(r2Var.E + 6), r2Var.getY() + AndroidUtilities.dp(64.33f));
            p80Var.d(rectF);
            p80Var.draw(canvas);
            rectF.set(((r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), r2Var.getY() + AndroidUtilities.dp(12.0f), (r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f), r2Var.getY() + AndroidUtilities.dp(20.33f));
            p80Var.d(rectF);
            p80Var.draw(canvas);
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
