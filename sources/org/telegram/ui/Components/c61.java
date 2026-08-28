package org.telegram.ui.Components;

import java.util.List;
public final class c61 implements h3.a2 {
    public final k61 f27373a;

    public c61(k61 k61Var) {
        this.f27373a = k61Var;
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i9) {
        k61 k61Var = this.f27373a;
        if (!k61Var.D && i9 == 3) {
            k61Var.D = true;
            if (k61Var.C && k61Var.E) {
                k61Var.D();
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i9) {
    }

    @Override
    public final void onCues(r4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(h3.b2 b2Var, h3.b2 b2Var2, int i9) {
    }

    @Override
    public final void onAudioAttributesChanged(j3.e eVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(h3.y1 y1Var) {
    }

    @Override
    public final void onDeviceInfoChanged(h3.m mVar) {
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
    public final void onMediaMetadataChanged(h3.h1 h1Var) {
    }

    @Override
    public final void onMetadata(z3.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(h3.x1 x1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i9) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i9) {
    }

    @Override
    public final void onPlayerError(h3.v1 v1Var) {
    }

    @Override
    public final void onPlayerErrorChanged(h3.v1 v1Var) {
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onRepeatModeChanged(int i9) {
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
    public final void onTracksChanged(h3.t2 t2Var) {
    }

    @Override
    public final void onVideoSizeChanged(e5.z zVar) {
    }

    @Override
    public final void onVolumeChanged(float f10) {
    }

    @Override
    public final void onDeviceVolumeChanged(int i9, boolean z10) {
    }

    @Override
    public final void onEvents(h3.c2 c2Var, h3.z1 z1Var) {
    }

    @Override
    public final void onMediaItemTransition(h3.f1 f1Var, int i9) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i9) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i9, int i10) {
    }

    @Override
    public final void onTimelineChanged(h3.r2 r2Var, int i9) {
    }
}
