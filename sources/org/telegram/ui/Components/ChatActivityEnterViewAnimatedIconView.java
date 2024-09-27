package org.telegram.ui.Components;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.ShareDialogCell$RepostStoryDrawable$$ExternalSyntheticLambda0;

public class ChatActivityEnterViewAnimatedIconView extends RLottieImageView {
    private TransitState animatingState;
    private State currentState;
    private Map stateMap;

    public static class AnonymousClass2 {
        static final int[] $SwitchMap$org$telegram$ui$Components$ChatActivityEnterViewAnimatedIconView$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$telegram$ui$Components$ChatActivityEnterViewAnimatedIconView$State = iArr;
            try {
                iArr[State.VOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$ChatActivityEnterViewAnimatedIconView$State[State.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum State {
        VOICE,
        VIDEO,
        STICKER,
        KEYBOARD,
        SMILE,
        GIF
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

        private static TransitState[] $values() {
            return new TransitState[]{VOICE_TO_VIDEO, STICKER_TO_KEYBOARD, SMILE_TO_KEYBOARD, VIDEO_TO_VOICE, KEYBOARD_TO_STICKER, KEYBOARD_TO_GIF, KEYBOARD_TO_SMILE, GIF_TO_KEYBOARD, GIF_TO_SMILE, SMILE_TO_GIF, SMILE_TO_STICKER, STICKER_TO_SMILE};
        }

        static {
            State state = State.VOICE;
            State state2 = State.VIDEO;
            VOICE_TO_VIDEO = new TransitState("VOICE_TO_VIDEO", 0, state, state2, R.raw.voice_to_video);
            State state3 = State.STICKER;
            State state4 = State.KEYBOARD;
            STICKER_TO_KEYBOARD = new TransitState("STICKER_TO_KEYBOARD", 1, state3, state4, R.raw.sticker_to_keyboard);
            State state5 = State.SMILE;
            SMILE_TO_KEYBOARD = new TransitState("SMILE_TO_KEYBOARD", 2, state5, state4, R.raw.smile_to_keyboard);
            VIDEO_TO_VOICE = new TransitState("VIDEO_TO_VOICE", 3, state2, state, R.raw.video_to_voice);
            KEYBOARD_TO_STICKER = new TransitState("KEYBOARD_TO_STICKER", 4, state4, state3, R.raw.keyboard_to_sticker);
            State state6 = State.GIF;
            KEYBOARD_TO_GIF = new TransitState("KEYBOARD_TO_GIF", 5, state4, state6, R.raw.keyboard_to_gif);
            KEYBOARD_TO_SMILE = new TransitState("KEYBOARD_TO_SMILE", 6, state4, state5, R.raw.keyboard_to_smile);
            GIF_TO_KEYBOARD = new TransitState("GIF_TO_KEYBOARD", 7, state6, state4, R.raw.gif_to_keyboard);
            GIF_TO_SMILE = new TransitState("GIF_TO_SMILE", 8, state6, state5, R.raw.gif_to_smile);
            SMILE_TO_GIF = new TransitState("SMILE_TO_GIF", 9, state5, state6, R.raw.smile_to_gif);
            SMILE_TO_STICKER = new TransitState("SMILE_TO_STICKER", 10, state5, state3, R.raw.smile_to_sticker);
            STICKER_TO_SMILE = new TransitState("STICKER_TO_SMILE", 11, state3, state5, R.raw.sticker_to_smile);
            $VALUES = $values();
        }

        private TransitState(String str, int i, State state, State state2, int i2) {
            this.firstState = state;
            this.secondState = state2;
            this.resource = i2;
        }

        public static TransitState valueOf(String str) {
            return (TransitState) Enum.valueOf(TransitState.class, str);
        }

        public static TransitState[] values() {
            return (TransitState[]) $VALUES.clone();
        }
    }

    public ChatActivityEnterViewAnimatedIconView(Context context) {
        super(context);
        this.stateMap = new HashMap() {
            @Override
            public RLottieDrawable get(Object obj) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) super.get(obj);
                if (rLottieDrawable != null) {
                    return rLottieDrawable;
                }
                int i = ((TransitState) obj).resource;
                return new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            }
        };
    }

    private TransitState getAnyState(State state) {
        for (TransitState transitState : TransitState.values()) {
            if (transitState.firstState == state) {
                return transitState;
            }
        }
        return null;
    }

    private TransitState getState(State state, State state2) {
        for (TransitState transitState : TransitState.values()) {
            if (transitState.firstState == state && transitState.secondState == state2) {
                return transitState;
            }
        }
        return null;
    }

    public void lambda$setState$0() {
        this.animatingState = null;
    }

    public void setState(State state, boolean z) {
        int i;
        if (z && state == this.currentState) {
            return;
        }
        State state2 = this.currentState;
        this.currentState = state;
        if (!z || state2 == null || getState(state2, state) == null) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) this.stateMap.get(getAnyState(this.currentState));
            rLottieDrawable.stop();
            rLottieDrawable.setProgress(0.0f, false);
            setAnimation(rLottieDrawable);
        } else {
            TransitState state3 = getState(state2, this.currentState);
            if (state3 == this.animatingState) {
                return;
            }
            this.animatingState = state3;
            RLottieDrawable rLottieDrawable2 = (RLottieDrawable) this.stateMap.get(state3);
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
            AndroidUtilities.runOnUIThread(new ShareDialogCell$RepostStoryDrawable$$ExternalSyntheticLambda0(rLottieDrawable2));
        }
        int i2 = AnonymousClass2.$SwitchMap$org$telegram$ui$Components$ChatActivityEnterViewAnimatedIconView$State[state.ordinal()];
        if (i2 == 1) {
            i = R.string.AccDescrVoiceMessage;
        } else if (i2 != 2) {
            return;
        } else {
            i = R.string.AccDescrVideoMessage;
        }
        setContentDescription(LocaleController.getString(i));
    }
}
