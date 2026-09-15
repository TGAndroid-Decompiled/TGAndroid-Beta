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
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
public final class m4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.c6 F;
    public long G;
    public int H;
    public rg.z0 I;
    public Drawable J;
    public final org.telegram.ui.Components.u9 f20420a;
    public final ai.p4 f20421b;
    public final org.telegram.ui.Components.f9 f20422c;
    public int d;
    public TLRPC.User e;
    public long f20423f;
    public final int h;
    public float f20424n;
    public boolean f20425r;
    public final wq f20426s;
    public final np v;
    public final boolean f20427w;
    public boolean f20428x;
    public final org.telegram.ui.Components.c6 f20429y;

    public m4(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f20422c = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        qr qrVar = qr.h;
        this.f20429y = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
        this.F = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
        this.H = org.telegram.ui.ActionBar.i6.f18836d6;
        this.f20427w = z10;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f20420a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(u9Var, w7.x5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ai.p4 p4Var = new ai.p4(context, 5);
        this.f20421b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        p4Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        p4Var.setTextSize(1, 12.0f);
        p4Var.setMaxLines(1);
        p4Var.setGravity(49);
        p4Var.setLines(1);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(p4Var, w7.x5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        wq wqVar = new wq(context, e6Var);
        this.f20426s = wqVar;
        addView(wqVar, w7.x5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.i6.W8;
        int i11 = org.telegram.ui.ActionBar.i6.U8;
        vq vqVar = wqVar.f29769a;
        vqVar.v = i10;
        vqVar.f29411w = i11;
        wqVar.setGravity(5);
        if (z10) {
            np npVar = new np(context, 21, e6Var);
            this.v = npVar;
            npVar.b(org.telegram.ui.ActionBar.i6.B5, org.telegram.ui.ActionBar.i6.f18907h5, org.telegram.ui.ActionBar.i6.C5);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(4);
            npVar.setProgressDelegate(new ma(this, 4));
            addView(npVar, w7.x5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            npVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, String str) {
        if (this.f20423f != j3) {
            this.f20425r = false;
            invalidate();
        }
        this.f20423f = j3;
        boolean isUserDialog = DialogObject.isUserDialog(j3);
        org.telegram.ui.Components.u9 u9Var = this.f20420a;
        org.telegram.ui.Components.f9 f9Var = this.f20422c;
        int i10 = this.h;
        ai.p4 p4Var = this.f20421b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.e = user;
            if (str != null) {
                p4Var.setText(str);
            } else if (user != null) {
                p4Var.setText(UserObject.getFirstName(user));
            } else {
                p4Var.setText("");
            }
            f9Var.m(i10, this.e);
            u9Var.e(this.e, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                p4Var.setText(str);
            } else if (chat != null) {
                p4Var.setText(chat.title);
            } else {
                p4Var.setText("");
            }
            f9Var.k(i10, chat);
            this.e = null;
            u9Var.e(chat, f9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.f18259id));
            this.f20420a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f20423f);
            wq wqVar = this.f20426s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    wqVar.f29769a.c(i11, this.f20425r);
                    return;
                }
                return;
            }
            this.d = 0;
            wqVar.f29769a.c(0, this.f20425r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f20428x && this.e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.e.f18259id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f20429y.f(this.E, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f20423f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f20427w) {
            org.telegram.ui.Components.u9 u9Var = this.f20420a;
            int measuredWidth = (u9Var.getMeasuredWidth() / 2) + u9Var.getLeft();
            int measuredHeight = (u9Var.getMeasuredHeight() / 2) + u9Var.getTop();
            org.telegram.ui.ActionBar.i6.f19032o0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
            org.telegram.ui.ActionBar.i6.f19032o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.f19032o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f20426s.f29769a.E = AndroidUtilities.dp(13.0f);
    }
}
