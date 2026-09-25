package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
public final class le extends FrameLayout {
    public final int f26081a;
    public final ChatActivityEnterView f26082b;

    public le(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f26081a = i10;
        this.f26082b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f26081a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26082b;
                ei.f4 f4Var = chatActivityEnterView.f22016k0;
                if (f4Var != null && f4Var.getVisibility() == 0) {
                    return chatActivityEnterView.f22016k0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f26082b;
                if (chatActivityEnterView2.J && chatActivityEnterView2.T4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f26081a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26082b;
                if (view == chatActivityEnterView.J0 && chatActivityEnterView.f21999h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f26081a) {
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
        switch (this.f26081a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f26082b;
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
        switch (this.f26081a) {
            case 2:
                super.setVisibility(i10);
                this.f26082b.P1(true);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
