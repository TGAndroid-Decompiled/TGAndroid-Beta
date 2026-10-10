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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.p01;
public abstract class h6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f22208a;
    public final TextView f22209b;
    public final tq f22210c;
    public final s2 d;
    public boolean f22211e;
    public final org.telegram.ui.Components.g6 f22212f;
    public final ja0 h;
    public boolean f22213n;

    public h6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        is isVar = is.h;
        this.f22212f = new org.telegram.ui.Components.g6(320L, isVar);
        this.f22213n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = n2Var.getResourceProvider();
        this.f22208a = resourceProvider;
        LinearLayout e7 = bi.e(context, 0);
        addView(e7, w7.x5.a(-2.0f, 16.66f, 11.6f, 16.66f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.f22209b = textView;
        bi.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        e7.addView(textView, w7.x5.q(-2, -2, 51));
        tq tqVar = new tq(context);
        this.f22210c = tqVar;
        tqVar.getDrawable().r(true, true);
        tqVar.b(0.3f, 165L, isVar);
        tqVar.setTypeface(AndroidUtilities.bold());
        tqVar.setTextSize(AndroidUtilities.dp(11.0f));
        tqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        tqVar.setGravity(3);
        e7.addView(tqVar, w7.x5.t(-1, 17, 51, 4, 1, 4, 0));
        s2 s2Var = new s2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = s2Var;
        s2Var.setBackgroundColor(0);
        s2Var.setDialogCellDelegate(new e6((p01) this, n2Var, context));
        s2Var.H = 15;
        s2Var.I = 83;
        addView(s2Var, w7.x5.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        ja0 ja0Var = new ja0();
        this.h = ja0Var;
        int i10 = org.telegram.ui.ActionBar.i6.f20892i6;
        ja0Var.f(org.telegram.ui.ActionBar.i6.m1(1.25f, org.telegram.ui.ActionBar.i6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.i6.m1(0.8f, org.telegram.ui.ActionBar.i6.w0(i10, resourceProvider)));
        ja0Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f22213n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        tq tqVar = this.f22210c;
        tqVar.a();
        float f12 = 0.0f;
        tqVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = tqVar.animate();
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
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(is.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            tqVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            tqVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            tqVar.setScaleY(f12);
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
            tqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f22211e = z11;
            s2 s2Var = this.d;
            if (z11) {
                s2Var.W(-chat.f20042id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
                long j3 = -chat.f20042id;
                int i11 = messageObject.messageOwner.date;
                if (s2Var.H0 != j3) {
                    s2Var.f22890x4 = -1;
                }
                s2Var.H0 = j3;
                s2Var.B4 = System.currentTimeMillis();
                s2Var.f22796f1 = messageObject;
                s2Var.f22871u2 = false;
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
                s2Var.f22801g1 = arrayList;
                MessageObject messageObject2 = s2Var.f22796f1;
                if (messageObject2 != null) {
                    s2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                s2Var.b0(0, z12);
            }
        }
        if (!z12) {
            this.f22212f.f(this.f22211e, true);
        }
        invalidate();
        this.f22213n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e7 = this.f22212f.e(this.f22211e);
        if (e7 > 0.0f) {
            ja0 ja0Var = this.h;
            ja0Var.setAlpha((int) (e7 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            s2 s2Var = this.d;
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(46.33f));
            ja0Var.e(rectF);
            ja0Var.draw(canvas);
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(64.33f));
            ja0Var.e(rectF);
            ja0Var.draw(canvas);
            rectF.set(((s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), s2Var.getY() + AndroidUtilities.dp(12.0f), (s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f), s2Var.getY() + AndroidUtilities.dp(20.33f));
            ja0Var.e(rectF);
            ja0Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void e() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L6, this.f22208a);
        tq tqVar = this.f22210c;
        tqVar.setTextColor(w02);
        tqVar.setBackground(org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.i6.m1(0.1f, w02)));
        this.f22209b.setTextColor(w02);
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
