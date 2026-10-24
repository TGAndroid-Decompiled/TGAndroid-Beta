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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.zr;
import org.telegram.ui.vz0;
public abstract class h6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f22468a;
    public final TextView f22469b;
    public final lq f22470c;
    public final q2 d;
    public boolean e;
    public final org.telegram.ui.Components.d6 f22471f;
    public final aa0 h;
    public boolean f22472n;

    public h6(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getContext());
        zr zrVar = zr.h;
        this.f22471f = new org.telegram.ui.Components.d6(320L, zrVar);
        this.f22472n = false;
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        this.f22468a = resourceProvider;
        LinearLayout e = tl.e(context, 0);
        addView(e, w7.z5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f22469b = textView;
        tl.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        e.addView(textView, w7.z5.q(-2, -2, 51));
        lq lqVar = new lq(context);
        this.f22470c = lqVar;
        lqVar.getDrawable().r(true, true);
        lqVar.b(0.3f, 165L, zrVar);
        lqVar.setTypeface(AndroidUtilities.bold());
        lqVar.setTextSize(AndroidUtilities.dp(11.0f));
        lqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        lqVar.setGravity(3);
        e.addView(lqVar, w7.z5.t(-1, 17, 51, 4, 1, 4, 0));
        q2 q2Var = new q2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = q2Var;
        q2Var.setBackgroundColor(0);
        q2Var.setDialogCellDelegate(new e6((vz0) this, o2Var, context));
        q2Var.H = 15;
        q2Var.I = 83;
        addView(q2Var, w7.z5.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        aa0 aa0Var = new aa0();
        this.h = aa0Var;
        int i10 = org.telegram.ui.ActionBar.k6.f21273i6;
        aa0Var.f(org.telegram.ui.ActionBar.k6.o1(1.25f, org.telegram.ui.ActionBar.k6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.k6.o1(0.8f, org.telegram.ui.ActionBar.k6.w0(i10, resourceProvider)));
        aa0Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String formatShortNumber;
        boolean z11;
        float f11;
        boolean z12 = this.f22472n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        lq lqVar = this.f22470c;
        lqVar.a();
        float f12 = 0.0f;
        lqVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = lqVar.animate();
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
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(zr.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            lqVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            lqVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            lqVar.setScaleY(f12);
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
            lqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.e = z11;
            q2 q2Var = this.d;
            if (z11) {
                q2Var.V(-chat.f20344id, null, 0, false, z12);
            } else {
                MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList);
                long j10 = -chat.f20344id;
                int i11 = messageObject.messageOwner.date;
                if (q2Var.H0 != j10) {
                    q2Var.f23040x4 = -1;
                }
                q2Var.H0 = j10;
                q2Var.B4 = System.currentTimeMillis();
                q2Var.f22945f1 = messageObject;
                q2Var.f23021u2 = false;
                q2Var.N0 = false;
                q2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                q2Var.S0 = 0;
                q2Var.T0 = false;
                q2Var.l1 = messageObject.getId();
                q2Var.U0 = 0;
                q2Var.V0 = 0;
                q2Var.W0 = 0;
                q2Var.X0 = messageObject.isUnread();
                q2Var.f22950g1 = arrayList;
                MessageObject messageObject2 = q2Var.f22945f1;
                if (messageObject2 != null) {
                    q2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                q2Var.a0(0, z12);
            }
        }
        if (!z12) {
            this.f22471f.f(this.e, true);
        }
        invalidate();
        this.f22472n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f22471f.e(this.e);
        if (e > 0.0f) {
            aa0 aa0Var = this.h;
            aa0Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            q2 q2Var = this.d;
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(46.33f));
            aa0Var.e(rectF);
            aa0Var.draw(canvas);
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(64.33f));
            aa0Var.e(rectF);
            aa0Var.draw(canvas);
            rectF.set(((q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), q2Var.getY() + AndroidUtilities.dp(12.0f), (q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f), q2Var.getY() + AndroidUtilities.dp(20.33f));
            aa0Var.e(rectF);
            aa0Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.f22468a);
        lq lqVar = this.f22470c;
        lqVar.setTextColor(w02);
        lqVar.setBackground(org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.k6.o1(0.1f, w02)));
        this.f22469b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
