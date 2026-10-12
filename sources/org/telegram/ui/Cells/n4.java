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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.or;
public final class n4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.g6 F;
    public long G;
    public int H;
    public rg.a1 I;
    public Drawable J;
    public final org.telegram.ui.Components.y9 f22274a;
    public final ai.q4 f22275b;
    public final org.telegram.ui.Components.j9 f22276c;
    public int d;
    public TLRPC.User f22277e;
    public long f22278f;
    public final int h;
    public float f22279n;
    public boolean f22280r;
    public final or f22281s;
    public final fq v;
    public final boolean f22282w;
    public boolean f22283x;
    public final org.telegram.ui.Components.g6 f22284y;

    public n4(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f22276c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.c6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        js jsVar = js.h;
        this.f22284y = new org.telegram.ui.Components.g6(this, 0L, 350L, jsVar);
        this.F = new org.telegram.ui.Components.g6(this, 0L, 350L, jsVar);
        this.H = org.telegram.ui.ActionBar.h6.f20560d6;
        this.f22282w = z10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22274a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(y9Var, w7.w5.a(54.0f, 0.0f, 7.0f, 0.0f, 0.0f, 54, 49));
        ai.q4 q4Var = new ai.q4(context, 5);
        this.f22275b = q4Var;
        NotificationCenter.listenEmojiLoading(q4Var);
        q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        q4Var.setTextSize(1, 12.0f);
        q4Var.setMaxLines(1);
        q4Var.setGravity(49);
        q4Var.setLines(1);
        q4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(q4Var, w7.w5.a(-2.0f, 6.0f, 64.0f, 6.0f, 0.0f, -1, 51));
        or orVar = new or(context, c6Var);
        this.f22281s = orVar;
        addView(orVar, w7.w5.a(28.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        int i10 = org.telegram.ui.ActionBar.h6.W8;
        int i11 = org.telegram.ui.ActionBar.h6.U8;
        nr nrVar = orVar.f29275a;
        nrVar.v = i10;
        nrVar.f28948w = i11;
        orVar.setGravity(5);
        if (z10) {
            fq fqVar = new fq(context, 21, c6Var);
            this.v = fqVar;
            fqVar.b(org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.f20631h5, org.telegram.ui.ActionBar.h6.C5);
            fqVar.setDrawUnchecked(false);
            fqVar.setDrawBackgroundAsArc(4);
            fqVar.setProgressDelegate(new ja(this, 4));
            addView(fqVar, w7.w5.a(24.0f, 19.0f, 42.0f, 0.0f, 0.0f, 24, 49));
            fqVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, String str) {
        if (this.f22278f != j3) {
            this.f22280r = false;
            invalidate();
        }
        this.f22278f = j3;
        boolean isUserDialog = DialogObject.isUserDialog(j3);
        org.telegram.ui.Components.y9 y9Var = this.f22274a;
        org.telegram.ui.Components.j9 j9Var = this.f22276c;
        int i10 = this.h;
        ai.q4 q4Var = this.f22275b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f22277e = user;
            if (str != null) {
                q4Var.setText(str);
            } else if (user != null) {
                q4Var.setText(UserObject.getFirstName(user));
            } else {
                q4Var.setText("");
            }
            j9Var.m(i10, this.f22277e);
            y9Var.e(this.f22277e, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                q4Var.setText(str);
            } else if (chat != null) {
                q4Var.setText(chat.title);
            } else {
                q4Var.setText("");
            }
            j9Var.k(i10, chat);
            this.f22277e = null;
            y9Var.e(chat, j9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.f22277e != null) {
            this.f22277e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.f22277e.f19950id));
            this.f22274a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f22278f);
            or orVar = this.f22281s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    orVar.f29275a.c(i11, this.f22280r);
                    return;
                }
                return;
            }
            this.d = 0;
            orVar.f29275a.c(0, this.f22280r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f22283x && this.f22277e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.f22277e.f19950id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f22284y.f(this.E, true);
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
        return this.f22278f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f22282w) {
            org.telegram.ui.Components.y9 y9Var = this.f22274a;
            int measuredWidth = (y9Var.getMeasuredWidth() / 2) + y9Var.getLeft();
            int measuredHeight = (y9Var.getMeasuredHeight() / 2) + y9Var.getTop();
            org.telegram.ui.ActionBar.h6.f20757o0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
            org.telegram.ui.ActionBar.h6.f20757o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.f20757o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f22281s.f29275a.E = AndroidUtilities.dp(13.0f);
    }
}
