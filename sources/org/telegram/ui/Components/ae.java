package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
public final class ae extends FrameLayout {
    public final int f25229a;
    public final ChatActivityEnterView f25230b;

    public ae(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f25229a = i10;
        this.f25230b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f25229a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25230b;
                sh.e3 e3Var = chatActivityEnterView.f24616h0;
                if (e3Var != null && e3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f24616h0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f25230b;
                if (chatActivityEnterView2.G && chatActivityEnterView2.P4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f25229a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f25230b;
                if (view == chatActivityEnterView.G0 && chatActivityEnterView.f24597e0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f25229a) {
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
        switch (this.f25229a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f25230b;
                if (chatActivityEnterView.G && chatActivityEnterView.P4 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f25229a) {
            case 2:
                super.setVisibility(i10);
                this.f25230b.P1(true);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
