package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;
import org.telegram.ui.ActionBar.Theme;

public class FragmentContextViewWavesDrawable {
    private float amplitude;
    private float amplitude2;
    private float animateAmplitudeDiff;
    private float animateAmplitudeDiff2;
    private float animateToAmplitude;
    WeavingState currentState;
    private long lastUpdateTime;
    WeavingState pausedState;
    WeavingState previousState;
    WeavingState[] states = new WeavingState[4];
    float progressToState = 1.0f;
    ArrayList<View> parents = new ArrayList<>();
    Paint paint = new Paint(1);
    LineBlobDrawable lineBlobDrawable = new LineBlobDrawable(5);
    LineBlobDrawable lineBlobDrawable1 = new LineBlobDrawable(7);
    LineBlobDrawable lineBlobDrawable2 = new LineBlobDrawable(8);
    Path path = new Path();

    public FragmentContextViewWavesDrawable() {
        new RectF();
        new Paint(1);
        for (int i = 0; i < 4; i++) {
            this.states[i] = new WeavingState(i);
        }
    }

    public void draw(float r21, float r22, float r23, float r24, android.graphics.Canvas r25, org.telegram.ui.Components.FragmentContextView r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextViewWavesDrawable.draw(float, float, float, float, android.graphics.Canvas, org.telegram.ui.Components.FragmentContextView, float):void");
    }

    private void checkColors() {
        int i = 0;
        while (true) {
            WeavingState[] weavingStateArr = this.states;
            if (i < weavingStateArr.length) {
                weavingStateArr[i].checkColor();
                i++;
            } else {
                return;
            }
        }
    }

    private void setState(int i, boolean z) {
        WeavingState weavingState = this.currentState;
        if (weavingState != null && weavingState.currentState == i) {
            return;
        }
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

    public void setAmplitude(float f) {
        this.animateToAmplitude = f;
        float f2 = this.amplitude;
        this.animateAmplitudeDiff = (f - f2) / 250.0f;
        this.animateAmplitudeDiff2 = (f - f2) / 120.0f;
    }

    public void addParent(View view) {
        if (!this.parents.contains(view)) {
            this.parents.add(view);
        }
    }

    public void removeParent(View view) {
        this.parents.remove(view);
        if (this.parents.isEmpty()) {
            this.pausedState = this.currentState;
            this.currentState = null;
            this.previousState = null;
        }
    }

    public void updateState(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (sharedInstance.isSwitchingStream() || !(callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                ChatObject.Call call = sharedInstance.groupCall;
                if (call != null) {
                    TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = call.participants.get(sharedInstance.getSelfId());
                    if ((tLRPC$TL_groupCallParticipant == null || tLRPC$TL_groupCallParticipant.can_self_unmute || !tLRPC$TL_groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
                        setState(sharedInstance.isMicMute() ? 1 : 0, z);
                        return;
                    }
                    sharedInstance.setMicMute(true, false, false);
                    setState(3, z);
                    return;
                }
                setState(sharedInstance.isMicMute() ? 1 : 0, z);
                return;
            }
            setState(2, z);
        }
    }

    public int getState() {
        WeavingState weavingState = this.currentState;
        if (weavingState != null) {
            return weavingState.currentState;
        }
        return 0;
    }

    public static class WeavingState {
        int color1;
        int color2;
        private final int currentState;
        private float duration;
        public Shader shader;
        private float startX;
        private float startY;
        private float time;
        private float targetX = -1.0f;
        private float targetY = -1.0f;
        private final Matrix matrix = new Matrix();
        String greenKey1 = "voipgroup_topPanelGreen1";
        String greenKey2 = "voipgroup_topPanelGreen2";
        String blueKey1 = "voipgroup_topPanelBlue1";
        String blueKey2 = "voipgroup_topPanelBlue2";
        String mutedByAdmin = "voipgroup_mutedByAdminGradient";
        String mutedByAdmin2 = "voipgroup_mutedByAdminGradient2";
        String mutedByAdmin3 = "voipgroup_mutedByAdminGradient3";

        public WeavingState(int i) {
            this.currentState = i;
            createGradients();
        }

        private void createGradients() {
            int i = this.currentState;
            if (i == 0) {
                int color = Theme.getColor(this.greenKey1);
                this.color1 = color;
                int color2 = Theme.getColor(this.greenKey2);
                this.color2 = color2;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color, color2}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 1) {
                int color3 = Theme.getColor(this.blueKey1);
                this.color1 = color3;
                int color4 = Theme.getColor(this.blueKey2);
                this.color2 = color4;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color3, color4}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 3) {
                int color5 = Theme.getColor(this.mutedByAdmin);
                this.color1 = color5;
                int color6 = Theme.getColor(this.mutedByAdmin2);
                this.color2 = color6;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color5, Theme.getColor(this.mutedByAdmin3), color6}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            }
        }

        public void update(int i, int i2, long j, float f) {
            if (this.currentState != 2) {
                float f2 = this.duration;
                if (f2 == 0.0f || this.time >= f2) {
                    this.duration = Utilities.random.nextInt(700) + 500;
                    this.time = 0.0f;
                    if (this.targetX == -1.0f) {
                        int i3 = this.currentState;
                        if (i3 == 3) {
                            this.targetX = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) - 0.3f;
                            this.targetY = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) + 0.7f;
                        } else if (i3 == 0) {
                            this.targetX = ((Utilities.random.nextInt(100) * 0.2f) / 100.0f) - 0.3f;
                            this.targetY = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.7f;
                        } else {
                            this.targetX = ((Utilities.random.nextInt(100) / 100.0f) * 0.2f) + 1.1f;
                            this.targetY = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                        }
                    }
                    this.startX = this.targetX;
                    this.startY = this.targetY;
                    int i4 = this.currentState;
                    if (i4 == 3) {
                        this.targetX = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) - 0.3f;
                        this.targetY = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) + 0.7f;
                    } else if (i4 == 0) {
                        this.targetX = ((Utilities.random.nextInt(100) * 0.2f) / 100.0f) - 0.3f;
                        this.targetY = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.7f;
                    } else {
                        this.targetX = ((Utilities.random.nextInt(100) / 100.0f) * 0.2f) + 1.1f;
                        this.targetY = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                    }
                }
                float f3 = (float) j;
                float f4 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f3) + (f3 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * f);
                this.time = f4;
                float f5 = this.duration;
                if (f4 > f5) {
                    this.time = f5;
                }
                float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f5);
                float f6 = i2;
                float f7 = this.startX;
                float f8 = ((f7 + ((this.targetX - f7) * interpolation)) * f6) - 200.0f;
                float f9 = this.startY;
                float f10 = (i * (f9 + ((this.targetY - f9) * interpolation))) - 200.0f;
                float f11 = f6 / 400.0f;
                int i5 = this.currentState;
                float f12 = f11 * ((i5 == 0 || i5 == 3) ? 3.0f : 1.5f);
                this.matrix.reset();
                this.matrix.postTranslate(f8, f10);
                this.matrix.postScale(f12, f12, f8 + 200.0f, f10 + 200.0f);
                this.shader.setLocalMatrix(this.matrix);
            }
        }

        public void checkColor() {
            int i = this.currentState;
            if (i == 0) {
                if (this.color1 != Theme.getColor(this.greenKey1) || this.color2 != Theme.getColor(this.greenKey2)) {
                    createGradients();
                }
            } else if (i == 1) {
                if (this.color1 != Theme.getColor(this.blueKey1) || this.color2 != Theme.getColor(this.blueKey2)) {
                    createGradients();
                }
            } else if (i != 3) {
            } else {
                if (this.color1 != Theme.getColor(this.mutedByAdmin) || this.color2 != Theme.getColor(this.mutedByAdmin2)) {
                    createGradients();
                }
            }
        }

        public void setToPaint(Paint paint) {
            int i = this.currentState;
            if (i == 0 || i == 1 || i == 3) {
                paint.setShader(this.shader);
                return;
            }
            paint.setShader(null);
            paint.setColor(Theme.getColor("voipgroup_topPanelGray"));
        }
    }
}
