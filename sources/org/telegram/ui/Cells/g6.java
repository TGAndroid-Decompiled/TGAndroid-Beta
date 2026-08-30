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
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.nr;
import org.telegram.ui.xz0;
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f21102a;
    public final TextView f21103b;
    public final bq f21104c;
    public final r2 d;
    public boolean e;
    public final org.telegram.ui.Components.z5 f21105f;
    public final i90 h;
    public boolean f21106n;

    public g6(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getContext());
        nr nrVar = nr.h;
        this.f21105f = new org.telegram.ui.Components.z5(320L, nrVar);
        this.f21106n = false;
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        this.f21102a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, k7.b6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f21103b = textView;
        org.telegram.ui.b.g(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f10.addView(textView, k7.b6.q(-2, -2, 51));
        bq bqVar = new bq(context);
        this.f21104c = bqVar;
        bqVar.getDrawable().o(true, true, false);
        bqVar.b(0.3f, 165L, nrVar);
        bqVar.setTypeface(AndroidUtilities.bold());
        bqVar.setTextSize(AndroidUtilities.dp(11.0f));
        bqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        bqVar.setGravity(3);
        f10.addView(bqVar, k7.b6.t(-1, 17, 51, 4, 1, 4, 0));
        r2 r2Var = new r2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = r2Var;
        r2Var.setBackgroundColor(0);
        r2Var.setDialogCellDelegate(new d6((xz0) this, p2Var, context));
        r2Var.E = 15;
        r2Var.F = 83;
        addView(r2Var, k7.b6.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        i90 i90Var = new i90();
        this.h = i90Var;
        int i10 = org.telegram.ui.ActionBar.j6.f19996i6;
        i90Var.e(org.telegram.ui.ActionBar.j6.l1(1.25f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)));
        i90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z4;
        float f10;
        float f11;
        String formatShortNumber;
        boolean z10;
        float f12;
        boolean z11 = this.f21106n;
        if (chat != null && chat.participants_count <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        bq bqVar = this.f21104c;
        bqVar.a();
        float f13 = 0.0f;
        bqVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z11) {
            ViewPropertyAnimator animate = bqVar.animate();
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
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(nr.h).start();
        } else {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            bqVar.setAlpha(f10);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            bqVar.setScaleX(f11);
            if (z4) {
                f13 = 1.0f;
            }
            bqVar.setScaleY(f13);
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
            bqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.e = z10;
            r2 r2Var = this.d;
            if (z10) {
                r2Var.W(-chat.f19184id, null, 0, false, z11);
            } else {
                MessageObject messageObject = (MessageObject) kh.a2.i(1, arrayList);
                long j10 = -chat.f19184id;
                int i11 = messageObject.messageOwner.date;
                if (r2Var.E0 != j10) {
                    r2Var.f21702q4 = -1;
                }
                r2Var.E0 = j10;
                r2Var.f21724u4 = System.currentTimeMillis();
                r2Var.f21630c1 = messageObject;
                r2Var.f21706r2 = false;
                r2Var.K0 = false;
                r2Var.O0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                r2Var.P0 = 0;
                r2Var.Q0 = false;
                r2Var.f21660i1 = messageObject.getId();
                r2Var.R0 = 0;
                r2Var.S0 = 0;
                r2Var.T0 = 0;
                r2Var.U0 = messageObject.isUnread();
                r2Var.f21634d1 = arrayList;
                MessageObject messageObject2 = r2Var.f21630c1;
                if (messageObject2 != null) {
                    r2Var.V0 = messageObject2.messageOwner.send_state;
                }
                r2Var.b0(0, z11);
            }
        }
        if (!z11) {
            this.f21105f.f(this.e, true);
        }
        invalidate();
        this.f21106n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f21105f.e(this.e);
        if (e > 0.0f) {
            i90 i90Var = this.h;
            i90Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            r2 r2Var = this.d;
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(46.33f));
            i90Var.d(rectF);
            i90Var.draw(canvas);
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(64.33f));
            i90Var.d(rectF);
            i90Var.draw(canvas);
            rectF.set(((r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), r2Var.getY() + AndroidUtilities.dp(12.0f), (r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f), r2Var.getY() + AndroidUtilities.dp(20.33f));
            i90Var.d(rectF);
            i90Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.f21102a);
        bq bqVar = this.f21104c;
        bqVar.setTextColor(v02);
        bqVar.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.j6.l1(0.1f, v02)));
        this.f21103b.setTextColor(v02);
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
