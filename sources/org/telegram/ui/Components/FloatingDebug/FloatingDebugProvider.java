package org.telegram.ui.Components.FloatingDebug;

import java.util.List;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
public interface FloatingDebugProvider {
    List<FloatingDebugController.DebugItem> onGetDebugItems();
}
