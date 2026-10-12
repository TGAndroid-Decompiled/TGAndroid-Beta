package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
public final class n4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.g6 F;
    public long G;
    public int H;
    public sg.a1 I;
    public Drawable J;
    public final org.telegram.ui.Components.z9 f21554a;
    public final bi.f4 f21555b;
    public final org.telegram.ui.Components.k9 f21556c;
    public int d;
    public TLRPC.User e;
    public long f21557f;
    public final int h;
    public float f21558n;
    public boolean f21559r;
    public final jr f21560s;
    public final aq v;
    public final boolean f21561w;
    public boolean f21562x;
    public final org.telegram.ui.Components.g6 f21563y;

    public n4(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f21556c = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        es esVar = es.h;
        this.f21563y = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.F = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.H = org.telegram.ui.ActionBar.g6.f19901d6;
        this.f21561w = z10;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f21554a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(z9Var, w7.a6.a(54.0f, 0.0f, 7.0f, 0.0f, 0.0f, 54, 49));
        bi.f4 f4Var = new bi.f4(context, 5);
        this.f21555b = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        f4Var.setTextSize(1, 12.0f);
        f4Var.setMaxLines(1);
        f4Var.setGravity(49);
        f4Var.setLines(1);
        f4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(f4Var, w7.a6.a(-2.0f, 6.0f, 64.0f, 6.0f, 0.0f, -1, 51));
        jr jrVar = new jr(context, c6Var);
        this.f21560s = jrVar;
        addView(jrVar, w7.a6.a(28.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        int i10 = org.telegram.ui.ActionBar.g6.W8;
        int i11 = org.telegram.ui.ActionBar.g6.U8;
        ir irVar = jrVar.f26455a;
        irVar.v = i10;
        irVar.f26072w = i11;
        jrVar.setGravity(5);
        if (z10) {
            aq aqVar = new aq(context, 21, c6Var);
            this.v = aqVar;
            aqVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.f19972h5, org.telegram.ui.ActionBar.g6.C5);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(4);
            aqVar.setProgressDelegate(new ja(this, 4));
            addView(aqVar, w7.a6.a(24.0f, 19.0f, 42.0f, 0.0f, 0.0f, 24, 49));
            aqVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f21557f != j10) {
            this.f21559r = false;
            invalidate();
        }
        this.f21557f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.z9 z9Var = this.f21554a;
        org.telegram.ui.Components.k9 k9Var = this.f21556c;
        int i10 = this.h;
        bi.f4 f4Var = this.f21555b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e = user;
            if (str != null) {
                f4Var.setText(str);
            } else if (user != null) {
                f4Var.setText(UserObject.getFirstName(user));
            } else {
                f4Var.setText("");
            }
            k9Var.m(i10, this.e);
            z9Var.e(this.e, k9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                f4Var.setText(str);
            } else if (chat != null) {
                f4Var.setText(chat.title);
            } else {
                f4Var.setText("");
            }
            k9Var.k(i10, chat);
            this.e = null;
            z9Var.e(chat, k9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.f19363id));
            this.f21554a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f21557f);
            jr jrVar = this.f21560s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    jrVar.f26455a.c(i11, this.f21559r);
                    return;
                }
                return;
            }
            this.d = 0;
            jrVar.f26455a.c(0, this.f21559r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f21562x && this.e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.e.f19363id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f21563y.f(this.E, true);
            if (this.G > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.F.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f21557f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f21561w) {
            org.telegram.ui.Components.z9 z9Var = this.f21554a;
            int measuredWidth = (z9Var.getMeasuredWidth() / 2) + z9Var.getLeft();
            int measuredHeight = (z9Var.getMeasuredHeight() / 2) + z9Var.getTop();
            org.telegram.ui.ActionBar.g6.f20098o0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B5, false));
            org.telegram.ui.ActionBar.g6.f20098o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.f20098o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f21560s.f26455a.E = AndroidUtilities.dp(13.0f);
    }
}
