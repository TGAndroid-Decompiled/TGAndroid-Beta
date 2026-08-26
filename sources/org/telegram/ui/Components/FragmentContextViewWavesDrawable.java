package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class FragmentContextViewWavesDrawable {
    public float amplitude;
    public float amplitude2;
    public float animateAmplitudeDiff;
    public float animateAmplitudeDiff2;
    public float animateToAmplitude;
    public WeavingState currentState;
    public long lastUpdateTime;
    public WeavingState pausedState;
    public WeavingState previousState;
    public final WeavingState[] states = new WeavingState[4];
    public float progressToState = 1.0f;
    public final ArrayList parents = new ArrayList();
    public final Paint paint = new Paint(1);
    public final Path path = new Path();

    public final class WeavingState {
        public int color1;
        public int color2;
        public int color3;
        public final int currentState;
        public float duration;
        public RadialGradient shader;
        public float startX;
        public float startY;
        public float time;
        public float targetX = -1.0f;
        public float targetY = -1.0f;
        public final Matrix matrix = new Matrix();
        public final int greenKey1 = Theme.key_voipgroup_topPanelGreen1;
        public final int greenKey2 = Theme.key_voipgroup_topPanelGreen2;
        public final int blueKey1 = Theme.key_voipgroup_topPanelBlue1;
        public final int blueKey2 = Theme.key_voipgroup_topPanelBlue2;
        public final int mutedByAdmin = Theme.key_voipgroup_mutedByAdminGradient;
        public final int mutedByAdmin2 = Theme.key_voipgroup_mutedByAdminGradient2;
        public final int mutedByAdmin3 = Theme.key_voipgroup_mutedByAdminGradient3;

        public WeavingState(int i) {
            this.currentState = i;
            createGradients();
        }

        public final void createGradients() {
            int i = this.currentState;
            if (i == 0) {
                int color = Theme.getColor(null, this.greenKey1, false);
                this.color1 = color;
                int color2 = Theme.getColor(null, this.greenKey2, false);
                this.color2 = color2;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color, color2}, (float[]) null, Shader.TileMode.CLAMP);
                return;
            }
            if (i == 1) {
                int color3 = Theme.getColor(null, this.blueKey1, false);
                this.color1 = color3;
                int color4 = Theme.getColor(null, this.blueKey2, false);
                this.color2 = color4;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color3, color4}, (float[]) null, Shader.TileMode.CLAMP);
                return;
            }
            if (i == 3) {
                int color5 = Theme.getColor(null, this.mutedByAdmin, false);
                this.color1 = color5;
                int color6 = Theme.getColor(null, this.mutedByAdmin3, false);
                this.color3 = color6;
                int color7 = Theme.getColor(null, this.mutedByAdmin2, false);
                this.color2 = color7;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color5, color6, color7}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            }
        }

        public final void setToPaint(Paint paint) {
            int i = this.currentState;
            if (i != 0 && i != 1 && i != 3) {
                paint.setShader(null);
                paint.setColor(Theme.getColor(null, Theme.key_voipgroup_topPanelGray, false));
            } else {
                if (LiteMode.isEnabled(512)) {
                    paint.setShader(this.shader);
                    return;
                }
                paint.setShader(null);
                if (i == 3) {
                    paint.setColor(ColorUtils.blendARGB(0.5f, ColorUtils.blendARGB(0.5f, this.color1, this.color2), this.color3));
                } else {
                    paint.setColor(ColorUtils.blendARGB(0.5f, this.color1, this.color2));
                }
            }
        }
    }

    public FragmentContextViewWavesDrawable() {
        for (int i = 0; i < 4; i++) {
            this.states[i] = new WeavingState(i);
        }
    }

    public final void setState(int i, boolean z) {
        WeavingState weavingState = this.currentState;
        if (weavingState == null || weavingState.currentState != i) {
            if (VoIPService.getSharedInstance() == null && this.currentState == null) {
                this.currentState = this.pausedState;
                return;
            }
            WeavingState weavingState2 = z ? this.currentState : null;
            this.previousState = weavingState2;
            this.currentState = this.states[i];
            if (weavingState2 != null) {
                this.progressToState = 0.0f;
            } else {
                this.progressToState = 1.0f;
            }
        }
    }

    public final void updateState(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                setState(2, z);
                return;
            }
            ChatObject.Call call = sharedInstance.groupCall;
            if (call == null) {
                setState(sharedInstance.isMicMute() ? 1 : 0, z);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
                setState(sharedInstance.isMicMute() ? 1 : 0, z);
            } else {
                sharedInstance.setMicMute(true, false, false);
                setState(3, z);
            }
        }
    }
}
