package org.telegram.ui.Components;

import java.util.List;
public final class c71 implements j3.y1 {
    public final k71 f25826a;

    public c71(k71 k71Var) {
        this.f25826a = k71Var;
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z4, int i10) {
        k71 k71Var = this.f25826a;
        if (!k71Var.E && i10 == 3) {
            k71Var.E = true;
            if (k71Var.D && k71Var.F) {
                k71Var.C();
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onCues(v4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(j3.z1 z1Var, j3.z1 z1Var2, int i10) {
    }

    @Override
    public final void onAudioAttributesChanged(l3.d dVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(j3.w1 w1Var) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z4) {
    }

    @Override
    public final void onIsPlayingChanged(boolean z4) {
    }

    @Override
    public final void onLoadingChanged(boolean z4) {
    }

    @Override
    public final void onMediaMetadataChanged(j3.e1 e1Var) {
    }

    @Override
    public final void onMetadata(e4.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(j3.v1 v1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerError(j3.t1 t1Var) {
    }

    @Override
    public final void onPlayerErrorChanged(j3.t1 t1Var) {
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override
    public final void onTracksChanged(j3.q2 q2Var) {
    }

    @Override
    public final void onVideoSizeChanged(i5.y yVar) {
    }

    @Override
    public final void onVolumeChanged(float f10) {
    }

    @Override
    public final void onEvents(j3.a2 a2Var, j3.x1 x1Var) {
    }

    @Override
    public final void onMediaItemTransition(j3.c1 c1Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z4, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(j3.o2 o2Var, int i10) {
    }
}
