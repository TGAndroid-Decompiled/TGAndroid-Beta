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
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yq;
public final class n4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.e6 F;
    public long G;
    public int H;
    public rg.z0 I;
    public Drawable J;
    public final org.telegram.ui.Components.w9 f20686a;
    public final ai.p4 f20687b;
    public final org.telegram.ui.Components.h9 f20688c;
    public int d;
    public TLRPC.User e;
    public long f20689f;
    public final int h;
    public float f20690n;
    public boolean f20691r;
    public final yq f20692s;
    public final pp v;
    public final boolean f20693w;
    public boolean f20694x;
    public final org.telegram.ui.Components.e6 f20695y;

    public n4(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f20688c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        sr srVar = sr.h;
        this.f20695y = new org.telegram.ui.Components.e6(this, 0L, 350L, srVar);
        this.F = new org.telegram.ui.Components.e6(this, 0L, 350L, srVar);
        this.H = org.telegram.ui.ActionBar.h6.f19059d6;
        this.f20693w = z10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20686a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(w9Var, w7.y5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ai.p4 p4Var = new ai.p4(context, 5);
        this.f20687b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        p4Var.setTextSize(1, 12.0f);
        p4Var.setMaxLines(1);
        p4Var.setGravity(49);
        p4Var.setLines(1);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(p4Var, w7.y5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        yq yqVar = new yq(context, d6Var);
        this.f20692s = yqVar;
        addView(yqVar, w7.y5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.W8;
        int i11 = org.telegram.ui.ActionBar.h6.U8;
        xq xqVar = yqVar.f30687a;
        xqVar.v = i10;
        xqVar.f30451w = i11;
        yqVar.setGravity(5);
        if (z10) {
            pp ppVar = new pp(context, 21, d6Var);
            this.v = ppVar;
            ppVar.b(org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.f19129h5, org.telegram.ui.ActionBar.h6.C5);
            ppVar.setDrawUnchecked(false);
            ppVar.setDrawBackgroundAsArc(4);
            ppVar.setProgressDelegate(new la(this, 4));
            addView(ppVar, w7.y5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            ppVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, String str) {
        if (this.f20689f != j3) {
            this.f20691r = false;
            invalidate();
        }
        this.f20689f = j3;
        boolean isUserDialog = DialogObject.isUserDialog(j3);
        org.telegram.ui.Components.w9 w9Var = this.f20686a;
        org.telegram.ui.Components.h9 h9Var = this.f20688c;
        int i10 = this.h;
        ai.p4 p4Var = this.f20687b;
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
            h9Var.m(i10, this.e);
            w9Var.e(this.e, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                p4Var.setText(str);
            } else if (chat != null) {
                p4Var.setText(chat.title);
            } else {
                p4Var.setText("");
            }
            h9Var.k(i10, chat);
            this.e = null;
            w9Var.e(chat, h9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.f18482id));
            this.f20686a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f20689f);
            yq yqVar = this.f20692s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    yqVar.f30687a.c(i11, this.f20691r);
                    return;
                }
                return;
            }
            this.d = 0;
            yqVar.f30687a.c(0, this.f20691r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f20694x && this.e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.e.f18482id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f20695y.f(this.E, true);
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
        return this.f20689f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f20693w) {
            org.telegram.ui.Components.w9 w9Var = this.f20686a;
            int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
            int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
            org.telegram.ui.ActionBar.h6.f19254o0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
            org.telegram.ui.ActionBar.h6.f19254o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.f19254o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f20692s.f30687a.E = AndroidUtilities.dp(13.0f);
    }
}
