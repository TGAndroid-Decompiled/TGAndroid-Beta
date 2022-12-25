package org.telegram.p009ui.Components.FloatingDebug;

import java.util.List;
import org.telegram.p009ui.Components.FloatingDebug.FloatingDebugController;

public interface FloatingDebugProvider {
    List<FloatingDebugController.DebugItem> onGetDebugItems();
}
