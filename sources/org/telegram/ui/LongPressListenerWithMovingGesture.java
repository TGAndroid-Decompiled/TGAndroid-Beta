package org.telegram.ui;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.GestureDetector2;

public class LongPressListenerWithMovingGesture implements View.OnTouchListener {
    GestureDetector2 gestureDetector2;
    private int[] location;
    Rect rect = new Rect();
    private View selectedMenuView;
    float startFromX;
    float startFromY;
    boolean subItemClicked;
    ActionBarPopupWindow submenu;
    boolean tapConfirmedOrCanceled;
    View view;

    public void onLongPress() {
        throw null;
    }

    public LongPressListenerWithMovingGesture() {
        GestureDetector2 gestureDetector2 = new GestureDetector2(new GestureDetector2.OnGestureListener() {
            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                View view = LongPressListenerWithMovingGesture.this.view;
                if (view != null) {
                    view.setPressed(true);
                    LongPressListenerWithMovingGesture.this.view.setSelected(true);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 21) {
                        if (i == 21 && LongPressListenerWithMovingGesture.this.view.getBackground() != null) {
                            LongPressListenerWithMovingGesture.this.view.getBackground().setVisible(true, false);
                        }
                        LongPressListenerWithMovingGesture.this.view.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                    }
                }
                return true;
            }

            @Override
            public void onUp(MotionEvent motionEvent) {
                View view = LongPressListenerWithMovingGesture.this.view;
                if (view != null) {
                    view.setPressed(false);
                    LongPressListenerWithMovingGesture.this.view.setSelected(false);
                    if (Build.VERSION.SDK_INT == 21 && LongPressListenerWithMovingGesture.this.view.getBackground() != null) {
                        LongPressListenerWithMovingGesture.this.view.getBackground().setVisible(false, false);
                    }
                }
                if (LongPressListenerWithMovingGesture.this.selectedMenuView != null) {
                    LongPressListenerWithMovingGesture longPressListenerWithMovingGesture = LongPressListenerWithMovingGesture.this;
                    if (longPressListenerWithMovingGesture.subItemClicked) {
                        return;
                    }
                    longPressListenerWithMovingGesture.selectedMenuView.callOnClick();
                    LongPressListenerWithMovingGesture.this.subItemClicked = true;
                }
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                View view;
                LongPressListenerWithMovingGesture longPressListenerWithMovingGesture = LongPressListenerWithMovingGesture.this;
                if (longPressListenerWithMovingGesture.tapConfirmedOrCanceled || (view = longPressListenerWithMovingGesture.view) == null) {
                    return false;
                }
                view.callOnClick();
                LongPressListenerWithMovingGesture.this.tapConfirmedOrCanceled = true;
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                LongPressListenerWithMovingGesture longPressListenerWithMovingGesture = LongPressListenerWithMovingGesture.this;
                if (longPressListenerWithMovingGesture.view != null) {
                    longPressListenerWithMovingGesture.onLongPress();
                }
            }
        });
        this.gestureDetector2 = gestureDetector2;
        this.location = new int[2];
        gestureDetector2.setIsLongpressEnabled(true);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.view = view;
        if (motionEvent.getAction() == 0) {
            this.startFromX = motionEvent.getX();
            this.startFromY = motionEvent.getY();
            this.tapConfirmedOrCanceled = false;
        }
        this.gestureDetector2.onTouchEvent(motionEvent);
        if (this.submenu != null && !this.subItemClicked && motionEvent.getAction() == 2) {
            this.view.getLocationOnScreen(this.location);
            float x = motionEvent.getX() + this.location[0];
            float y = motionEvent.getY() + this.location[1];
            this.submenu.getContentView().getLocationOnScreen(this.location);
            int[] iArr = this.location;
            float f = x - iArr[0];
            float f2 = y - iArr[1];
            this.selectedMenuView = null;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.submenu.getContentView();
            for (int i = 0; i < actionBarPopupWindowLayout.getItemsCount(); i++) {
                View itemAt = actionBarPopupWindowLayout.getItemAt(i);
                itemAt.getHitRect(this.rect);
                itemAt.getTag();
                if (itemAt.getVisibility() == 0 && itemAt.isClickable()) {
                    if (!this.rect.contains((int) f, (int) f2)) {
                        itemAt.setPressed(false);
                        itemAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && itemAt.getBackground() != null) {
                            itemAt.getBackground().setVisible(false, false);
                        }
                    } else {
                        itemAt.setPressed(true);
                        itemAt.setSelected(true);
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 21) {
                            if (i2 == 21 && itemAt.getBackground() != null) {
                                itemAt.getBackground().setVisible(true, false);
                            }
                            itemAt.drawableHotspotChanged(f, f2 - itemAt.getTop());
                        }
                        this.selectedMenuView = itemAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.startFromX) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.startFromY) > AndroidUtilities.touchSlop * 2.0f) {
            this.tapConfirmedOrCanceled = true;
            this.view.setPressed(false);
            this.view.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.subItemClicked && !this.tapConfirmedOrCanceled) {
            View view3 = this.selectedMenuView;
            if (view3 != null) {
                view3.callOnClick();
                this.subItemClicked = true;
            } else if (this.submenu == null && (view2 = this.view) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }

    public void setSubmenu(ActionBarPopupWindow actionBarPopupWindow) {
        this.submenu = actionBarPopupWindow;
    }
}
