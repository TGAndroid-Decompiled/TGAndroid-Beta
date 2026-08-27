package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;

public final class wd extends FrameLayout {

    public final int f34160a;

    public final ChatActivityEnterView f34161b;

    public wd(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f34160a = i10;
        this.f34161b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f34160a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34161b;
                nh.t3 t3Var = chatActivityEnterView.f26110g0;
                return (t3Var == null || t3Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.f26110g0.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f34161b;
                if (!chatActivityEnterView2.F || chatActivityEnterView2.O4 == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f34160a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f34161b;
                if (view == chatActivityEnterView.F0 && chatActivityEnterView.f26090d0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34160a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                setPivotX(i10 - AndroidUtilities.dp(22.0f));
                setPivotY(i11 - AndroidUtilities.dp(22.0f));
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34160a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f34161b;
                if (!chatActivityEnterView.F || chatActivityEnterView.O4 == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f34160a) {
            case 2:
                super.setVisibility(i10);
                this.f34161b.O1(true);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
