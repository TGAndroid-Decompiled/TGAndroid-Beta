package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
public final class le extends FrameLayout {
    public final int f24967a;
    public final ChatActivityEnterView f24968b;

    public le(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f24967a = i10;
        this.f24968b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f24967a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24968b;
                di.i4 i4Var = chatActivityEnterView.f20879k0;
                if (i4Var != null && i4Var.getVisibility() == 0) {
                    return chatActivityEnterView.f20879k0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f24968b;
                if (chatActivityEnterView2.J && chatActivityEnterView2.S4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f24967a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f24968b;
                if (view == chatActivityEnterView.J0 && chatActivityEnterView.f20862h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f24967a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                setPivotX(i10 - AndroidUtilities.dp(22.0f));
                setPivotY(i11 - AndroidUtilities.dp(22.0f));
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24967a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f24968b;
                if (chatActivityEnterView.J && chatActivityEnterView.S4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f24967a) {
            case 2:
                super.setVisibility(i10);
                this.f24968b.P1(true);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
