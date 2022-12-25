package org.telegram.p009ui.Components;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.Cells.ChatActionCell$$ExternalSyntheticLambda2;

public class ChatActivityEnterViewAnimatedIconView extends RLottieImageView {
    private TransitState animatingState;
    private State currentState;
    private Map<TransitState, RLottieDrawable> stateMap;

    public enum State {
        VOICE,
        VIDEO,
        STICKER,
        KEYBOARD,
        SMILE,
        GIF
    }

    public ChatActivityEnterViewAnimatedIconView(Context context) {
        super(context);
        this.stateMap = new HashMap<TransitState, RLottieDrawable>(this) {
            @Override
            public RLottieDrawable get(Object obj) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) super.get(obj);
                if (rLottieDrawable == null) {
                    int i = ((TransitState) obj).resource;
                    return new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.m35dp(32.0f), AndroidUtilities.m35dp(32.0f));
                }
                return rLottieDrawable;
            }
        };
    }

    public void setState(State state, boolean z) {
        if (z && state == this.currentState) {
            return;
        }
        State state2 = this.currentState;
        this.currentState = state;
        if (!z || state2 == null || getState(state2, state) == null) {
            RLottieDrawable rLottieDrawable = this.stateMap.get(getAnyState(this.currentState));
            rLottieDrawable.stop();
            rLottieDrawable.setProgress(0.0f, false);
            setAnimation(rLottieDrawable);
        } else {
            TransitState state3 = getState(state2, this.currentState);
            if (state3 == this.animatingState) {
                return;
            }
            this.animatingState = state3;
            RLottieDrawable rLottieDrawable2 = this.stateMap.get(state3);
            rLottieDrawable2.stop();
            rLottieDrawable2.setProgress(0.0f, false);
            rLottieDrawable2.setAutoRepeat(0);
            rLottieDrawable2.setOnAnimationEndListener(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterViewAnimatedIconView.this.lambda$setState$0();
                }
            });
            setAnimation(rLottieDrawable2);
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda2(rLottieDrawable2));
        }
        int i = C19672.f1042x9047a843[state.ordinal()];
        if (i == 1) {
            setContentDescription(LocaleController.getString("AccDescrVoiceMessage", C1072R.string.AccDescrVoiceMessage));
        } else if (i != 2) {
        } else {
            setContentDescription(LocaleController.getString("AccDescrVideoMessage", C1072R.string.AccDescrVideoMessage));
        }
    }

    public void lambda$setState$0() {
        this.animatingState = null;
    }

    public static class C19672 {
        static final int[] f1042x9047a843;

        static {
            int[] iArr = new int[State.values().length];
            f1042x9047a843 = iArr;
            try {
                iArr[State.VOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1042x9047a843[State.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private TransitState getAnyState(State state) {
        TransitState[] values;
        for (TransitState transitState : TransitState.values()) {
            if (transitState.firstState == state) {
                return transitState;
            }
        }
        return null;
    }

    private TransitState getState(State state, State state2) {
        TransitState[] values;
        for (TransitState transitState : TransitState.values()) {
            if (transitState.firstState == state && transitState.secondState == state2) {
                return transitState;
            }
        }
        return null;
    }

    public static final class TransitState {
        private static final TransitState[] $VALUES;
        public static final TransitState GIF_TO_KEYBOARD;
        public static final TransitState GIF_TO_SMILE;
        public static final TransitState KEYBOARD_TO_GIF;
        public static final TransitState KEYBOARD_TO_SMILE;
        public static final TransitState KEYBOARD_TO_STICKER;
        public static final TransitState SMILE_TO_GIF;
        public static final TransitState SMILE_TO_KEYBOARD;
        public static final TransitState SMILE_TO_STICKER;
        public static final TransitState STICKER_TO_KEYBOARD;
        public static final TransitState STICKER_TO_SMILE;
        public static final TransitState VIDEO_TO_VOICE;
        public static final TransitState VOICE_TO_VIDEO;
        final State firstState;
        final int resource;
        final State secondState;

        public static TransitState valueOf(String str) {
            return (TransitState) Enum.valueOf(TransitState.class, str);
        }

        public static TransitState[] values() {
            return (TransitState[]) $VALUES.clone();
        }

        static {
            State state = State.VOICE;
            State state2 = State.VIDEO;
            TransitState transitState = new TransitState("VOICE_TO_VIDEO", 0, state, state2, C1072R.raw.voice_to_video);
            VOICE_TO_VIDEO = transitState;
            State state3 = State.STICKER;
            State state4 = State.KEYBOARD;
            TransitState transitState2 = new TransitState("STICKER_TO_KEYBOARD", 1, state3, state4, C1072R.raw.sticker_to_keyboard);
            STICKER_TO_KEYBOARD = transitState2;
            State state5 = State.SMILE;
            TransitState transitState3 = new TransitState("SMILE_TO_KEYBOARD", 2, state5, state4, C1072R.raw.smile_to_keyboard);
            SMILE_TO_KEYBOARD = transitState3;
            TransitState transitState4 = new TransitState("VIDEO_TO_VOICE", 3, state2, state, C1072R.raw.video_to_voice);
            VIDEO_TO_VOICE = transitState4;
            TransitState transitState5 = new TransitState("KEYBOARD_TO_STICKER", 4, state4, state3, C1072R.raw.keyboard_to_sticker);
            KEYBOARD_TO_STICKER = transitState5;
            State state6 = State.GIF;
            TransitState transitState6 = new TransitState("KEYBOARD_TO_GIF", 5, state4, state6, C1072R.raw.keyboard_to_gif);
            KEYBOARD_TO_GIF = transitState6;
            TransitState transitState7 = new TransitState("KEYBOARD_TO_SMILE", 6, state4, state5, C1072R.raw.keyboard_to_smile);
            KEYBOARD_TO_SMILE = transitState7;
            TransitState transitState8 = new TransitState("GIF_TO_KEYBOARD", 7, state6, state4, C1072R.raw.gif_to_keyboard);
            GIF_TO_KEYBOARD = transitState8;
            TransitState transitState9 = new TransitState("GIF_TO_SMILE", 8, state6, state5, C1072R.raw.gif_to_smile);
            GIF_TO_SMILE = transitState9;
            TransitState transitState10 = new TransitState("SMILE_TO_GIF", 9, state5, state6, C1072R.raw.smile_to_gif);
            SMILE_TO_GIF = transitState10;
            TransitState transitState11 = new TransitState("SMILE_TO_STICKER", 10, state5, state3, C1072R.raw.smile_to_sticker);
            SMILE_TO_STICKER = transitState11;
            TransitState transitState12 = new TransitState("STICKER_TO_SMILE", 11, state3, state5, C1072R.raw.sticker_to_smile);
            STICKER_TO_SMILE = transitState12;
            $VALUES = new TransitState[]{transitState, transitState2, transitState3, transitState4, transitState5, transitState6, transitState7, transitState8, transitState9, transitState10, transitState11, transitState12};
        }

        private TransitState(String str, int i, State state, State state2, int i2) {
            this.firstState = state;
            this.secondState = state2;
            this.resource = i2;
        }
    }
}
