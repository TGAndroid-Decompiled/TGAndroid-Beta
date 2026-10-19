package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
public final class ke extends FrameLayout {
    public final int f27832a;
    public final ChatActivityEnterView f27833b;

    public ke(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f27832a = i10;
        this.f27833b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f27832a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f27833b;
                gi.v3 v3Var = chatActivityEnterView.f23969k0;
                if (v3Var != null && v3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f23969k0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f27833b;
                if (chatActivityEnterView2.J && chatActivityEnterView2.T4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f27832a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f27833b;
                if (view == chatActivityEnterView.J0 && chatActivityEnterView.f23951h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f27832a) {
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
        switch (this.f27832a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f27833b;
                if (chatActivityEnterView.J && chatActivityEnterView.T4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f27832a) {
            case 2:
                super.setVisibility(i10);
                this.f27833b.M1(true);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
