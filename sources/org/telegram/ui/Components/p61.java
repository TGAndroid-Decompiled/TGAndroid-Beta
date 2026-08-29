package org.telegram.ui.Components;

import java.util.List;
public final class p61 implements j3.a2 {
    public final x61 f31605a;

    public p61(x61 x61Var) {
        this.f31605a = x61Var;
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        x61 x61Var = this.f31605a;
        if (!x61Var.D && i10 == 3) {
            x61Var.D = true;
            if (x61Var.C && x61Var.E) {
                x61Var.D();
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onCues(t4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(j3.b2 b2Var, j3.b2 b2Var2, int i10) {
    }

    @Override
    public final void onAudioAttributesChanged(l3.e eVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(j3.y1 y1Var) {
    }

    @Override
    public final void onDeviceInfoChanged(j3.m mVar) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onMediaMetadataChanged(j3.h1 h1Var) {
    }

    @Override
    public final void onMetadata(b4.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(j3.x1 x1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerError(j3.v1 v1Var) {
    }

    @Override
    public final void onPlayerErrorChanged(j3.v1 v1Var) {
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
    }

    @Override
    public final void onSeekProcessed() {
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override
    public final void onTracksChanged(j3.t2 t2Var) {
    }

    @Override
    public final void onVideoSizeChanged(g5.y yVar) {
    }

    @Override
    public final void onVolumeChanged(float f9) {
    }

    @Override
    public final void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override
    public final void onEvents(j3.c2 c2Var, j3.z1 z1Var) {
    }

    @Override
    public final void onMediaItemTransition(j3.f1 f1Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(j3.r2 r2Var, int i10) {
    }
}
